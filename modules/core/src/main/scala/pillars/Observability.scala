// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package pillars

import cats.effect.IO
import cats.effect.Resource
import cats.syntax.all.*
import io.circe.Codec
import io.circe.derivation.Configuration
import io.github.iltotore.iron.*
import io.github.iltotore.iron.circe.given
import io.github.iltotore.iron.constraint.all.*
import org.http4s.Request
import org.http4s.Response
import org.http4s.Uri
import org.http4s.headers.`User-Agent`
import org.typelevel.otel4s.Attribute
import org.typelevel.otel4s.AttributeKey
import org.typelevel.otel4s.Attributes as OtelAttributes
import org.typelevel.otel4s.metrics.Meter
import org.typelevel.otel4s.sdk.OpenTelemetrySdk
import org.typelevel.otel4s.sdk.TelemetryResource
import org.typelevel.otel4s.sdk.exporter.otlp.autoconfigure.OtlpExportersAutoConfigure
import org.typelevel.otel4s.trace.StatusCode
import org.typelevel.otel4s.trace.Tracer
import sttp.tapir.Endpoint
import sttp.tapir.model.ServerRequest
import sttp.tapir.server.interceptor.EndpointInterceptor
import sttp.tapir.server.interceptor.Interceptor
import sttp.tapir.server.model.ServerResponse

final case class Observability(tracer: Tracer[IO], metrics: Meter[IO], interceptor: Interceptor[IO]):
    export metrics.*
    export tracer.span
    export tracer.spanBuilder

    def recordException(error: Throwable): IO[Unit] =
        for
            span <- tracer.currentSpanOrNoop
            _    <- span.recordException(error)
            _    <- span.setStatus(StatusCode.Error, error.getMessage)
            _    <- span.addAttribute(Attribute("error.type", error.getClass.getCanonicalName))
        yield ()

end Observability
object Observability:
    def apply(using p: Pillars): Run[Observability] = p.observability
    def noop: IO[Observability]                     =
        Observability(Tracer.noop[IO], Meter.noop[IO], EndpointInterceptor.noop[IO]).pure[IO]

    def init(
        appInfo: AppInfo,
        config: Config
    ): Resource[IO, Observability] =
        if config.isEnabled then
            for
                otel4s       <- OpenTelemetrySdk.autoConfigured[IO]: builder =>
                                    builder
                                        .addExportersConfigurer(OtlpExportersAutoConfigure[IO])
                                        .addResourceCustomizer: (resource, otelConfig) =>
                                            val configured =
                                                TelemetryResource(
                                                  OtelAttributes(
                                                    appInfo.name.toAttribute("service.name"),
                                                    appInfo.version.toAttribute("service.version")
                                                  ) ++ config.getCustomAttributes
                                                )
                                            resource.mergeUnsafe(configured)
                sdk           = otel4s.sdk
                tracer       <- (if config.traces.enabled then
                                     sdk.tracerProvider.get(config.traces.name.getOrElse(config.serviceName))
                                 else Tracer.noop[IO].pure[IO]).toResource
                meter        <- (if config.metrics.enabled then
                                     sdk.meterProvider.get(config.metrics.name.getOrElse(config.serviceName))
                                 else Meter.noop[IO].pure[IO]).toResource
                tapirMetrics <- Metrics.init(meter).toResource
            yield Observability(tracer, meter, tapirMetrics.metricsInterceptor())
        else
            noop.toResource
    final case class Config(
        enabled: Boolean = false,
        metrics: Config.Metrics = Config.Metrics(),
        traces: Config.Traces = Config.Traces(),
        serviceName: ServiceName = ServiceName("pillars"),
        customAttributes: Map[String, String] = Map.empty
    ) extends pillars.Config:
        def isEnabled: Boolean = enabled && (metrics.enabled || traces.enabled)

        def getCustomAttributes: Seq[Attribute[String]] = customAttributes.map((k, v) => v.toAttribute(k)).toSeq
    end Config

    object Config:
        given Configuration = pillars.Config.defaultCirceConfig
        given Codec[Config] = Codec.AsObject.derivedConfigured

        final case class Metrics(
            enabled: Boolean = false,
            name: Option[ServiceName] = None
        ) derives Codec.AsObject
        final case class Traces(
            enabled: Boolean = false,
            name: Option[ServiceName] = None
        ) derives Codec.AsObject
    end Config

    private type ServiceNameConstraint = Not[Blank]
    type ServiceName                   = ServiceName.T
    object ServiceName extends RefinedSubtype[String, ServiceNameConstraint]

    extension [A <: String](value: A)
        def toAttribute(name: String): Attribute[String] = Attribute(name, value)

    extension [A <: Long](value: Long)
        def toAttribute(name: String): Attribute[Long] = Attribute(name, value)

    extension [A <: Double](value: Double)
        def toAttribute(name: String): Attribute[Double] = Attribute(name, value)

    extension [A <: Boolean](value: Boolean)
        def toAttribute(name: String): Attribute[Boolean] = Attribute(name, value)

    object Attributes:
        def fromRequest(request: Request[IO]): OtelAttributes =
            val scheme = request.uri.scheme.map(_.value).getOrElse("http")
            OtelAttributes
                .newBuilder
                .addOne("http.request.method", request.method.name)
                .addOne("url.scheme", scheme)
                .addOne("network.protocol.name", scheme)
                .addOne("url.full", request.uri.renderString)
                .addOne("url.query", request.uri.query.renderString)
                .addOne("server.address", request.uri.authority.map(_.host.renderString).getOrElse("localhost"))
                .addOne(
                  "server.port",
                  request.uri.authority.map(_.port).getOrElse(if request.uri.scheme.contains(Uri.Scheme.https) then 443
                  else 80).toString
                )
                .addOne("network.protocol.version", request.httpVersion.renderString)
                .addOne("user.agent", request.headers.get(`User-Agent`.name).map(_.head.value).getOrElse("Unknown"))
                .result()
        end fromRequest

        def fromTapirRequest(request: ServerRequest): OtelAttributes =
            OtelAttributes
                .newBuilder
                .addOne("http.request.method", request.method.method)
                .addOne("url.full", request.uri.toString)
                .addOne("url.query", request.queryParameters.toString)
                .addOne("url.scheme", request.uri.scheme.getOrElse("http"))
                .addOne("network.protocol.name", request.protocol)
                .addOne("server.address", request.uri.authority.map(_.host).getOrElse("localhost"))
                .addOne(
                  "server.port",
                  request.uri.authority.map(_.port).getOrElse(if request.uri.scheme.contains("https") then 443
                  else 80).toString
                )
                .addOne("user.agent", request.headers(`User-Agent`.name.toString))
                .result()

        def fromTapirEndpoint(endpoint: Endpoint[?, ?, ?, ?, ?]): OtelAttributes =
            OtelAttributes
                .newBuilder
                .addOne("http.route", endpoint.showPathTemplate(showQueryParam = None))
                .result()

        def fromTapirResponse(response: ServerResponse[?]): OtelAttributes =
            responseAttributes(response.code.code)

        def fromResponse(response: Response[IO]): OtelAttributes =
            responseAttributes(response.status.code)

        private def responseAttributes(status: Int) =
            OtelAttributes
                .newBuilder
                .addOne("http.response.status_code", status.toString)
                .addOne(
                  "http.response.status",
                  status match
                      case s if s < 200 => "1xx"
                      case s if s < 300 => "2xx"
                      case s if s < 400 => "3xx"
                      case s if s < 500 => "4xx"
                      case _            => "5xx"
                )
                .result()

        def fromError(error: Throwable): OtelAttributes =
            OtelAttributes
                .newBuilder
                .addOne[Boolean]("error", true)
                .addOne("error.type", error.getClass.getCanonicalName)
                .result()
    end Attributes
end Observability
