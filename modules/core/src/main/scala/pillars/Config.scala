// Copyright (c) 2024-2024 by Raphaël Lemaitre and Contributors
// This software is licensed under the Eclipse Public License v2.0 (EPL-2.0).
// For more information see LICENSE or https://opensource.org/license/epl-2-0

package pillars

import cats.Show
import cats.effect.IO
import cats.effect.Resource
import cats.syntax.all.*
import fs2.io.file.Files
import fs2.io.file.Path
import io.circe.Decoder
import io.circe.Encoder
import io.circe.Json
import io.circe.ParsingFailure
import io.circe.derivation.Configuration
import io.circe.yaml.Parser
import io.github.iltotore.iron.*
import io.github.iltotore.iron.circe.given
import pillars.AdminServer.Config
import pillars.PillarsError.Code
import pillars.PillarsError.ErrorNumber
import pillars.PillarsError.Message
import scala.util.matching.Regex
import scodec.bits.ByteVector

def config(using p: Pillars): Config.PillarsConfig = p.config

trait Config

object Config:
    val defaultCirceConfig: Configuration =
        Configuration.default.withKebabCaseMemberNames.withKebabCaseConstructorNames.withDefaults
    case class PillarsConfig(
        name: App.Name,
        log: Logging.Config = Logging.Config(),
        api: ApiServer.Config,
        admin: AdminServer.Config,
        observability: Observability.Config
    ) extends pillars.Config

    object PillarsConfig:
        given Configuration          = defaultCirceConfig
        given Decoder[PillarsConfig] = Decoder.derivedConfigured
        given Encoder[PillarsConfig] = Encoder.AsObject.derivedConfigured
    end PillarsConfig

    case class Reader(path: Path):
        private def matcher(regMatch: Regex.Match): String = sys.env
            .getOrElse(regMatch.group(1), throw ConfigError.MissingEnvironmentVariable(regMatch.group(1)))

        private val regex: Regex = """\$\{([^}]+)}""".r

        private def readConfig[T: Decoder](using Files[IO]): Resource[IO, Either[ParsingFailure, Json]] =
            Resource.eval(Files[IO].readUtf8(path)
                .map(regex.replaceAllIn(_, matcher))
                .map(Parser.default.parse)
                .compile
                .onlyOrError)

        def read[T: Decoder](using Files[IO]): IO[T] =
            readConfig[T].use: json =>
                IO.fromEither:
                    json
                        .leftMap(ConfigError.ParsingError.apply)
                        .flatMap(_.as[T])
        end read

        def read[T: Decoder](key: String)(using Files[IO]): IO[T] =
            readConfig[T].use: parsed =>
                IO.fromEither:
                    parsed match
                        case Left(failure) => Left(ConfigError.ParsingError(failure))
                        case Right(json)   => json.hcursor.downField(key).as[T].leftMap(ConfigError.ParsingError.apply)
    end Reader

    final case class Redacted[T](value: T) extends AnyVal:
        override def toString: String = s"REDACTED"

    object Redacted:
        given [T: Decoder: Show]: Decoder[Redacted[T]] = summon[Decoder[T]].map(Redacted.apply)
        given [T: Encoder: Show]: Encoder[Redacted[T]] = summon[Encoder[T]].contramap(_.value)
    end Redacted

    final case class Secret[T](value: T) extends AnyVal:
        override def toString: String =
            val hash = ByteVector(value.hashCode).padRight(4).toHex.take(4)
            s"REDACTED-$hash"
    end Secret

    object Secret:
        given [T: Decoder]: Decoder[Secret[T]] = summon[Decoder[T]].map(Secret.apply)
        given [T: Encoder]: Encoder[Secret[T]] = summon[Encoder[T]].contramap(_.value)
    end Secret

    private enum ConfigError(val number: ErrorNumber) extends PillarsError:
        override def code: Code = Code("CONF")

        case MissingEnvironmentVariable(name: String) extends ConfigError(ErrorNumber(1))
        case ParsingError(cause: Throwable)           extends ConfigError(ErrorNumber(2))

        override def message: Message = this match
            case ConfigError.MissingEnvironmentVariable(name) => Message(s"Missing environment variable $name".assume)
            case ConfigError.ParsingError(cause)              =>
                Message(s"Failed to parse configuration: ${cause.getMessage}".assume)
    end ConfigError
end Config
