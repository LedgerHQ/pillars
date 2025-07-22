import sbt.*

object versions {
    val scala            = "3.6.4"
    // Dependencies
    val cats             = "2.13.0"
    val catsEffect       = "3.6.0"
    val circe            = "0.14.12"
    val circeYaml        = "0.16.0"
    val decline          = "2.5.0"
    val doobie           = "1.0.0-RC9"
    val flyway           = "11.5.0"
    val fs2              = "3.12.0"
    val fs2Rabbit        = "5.2.0"
    val http4s           = "0.23.30"
    val ip4s             = "3.6.0"
    val iron             = "3.0.1"
    val literally        = "1.2.0"
    val otel4s           = "0.13.1"
    val postgresqlDriver = "42.7.5"
    val rediculous       = "0.5.1"
    val scribe           = "3.16.0"
    val skunk            = "1.0.0-M10"
    val tapir            = "1.11.32"
    val testContainers   = "0.43.0"

    object munit {
        val core       = "1.1.0"
        val catsEffect = "2.1.0"
        val scalacheck = "1.1.0"
        val http4s     = "1.1.0"
    }

    object scodec {
        val bits = "1.2.1"
        val core = "2.3.2"
    }
}

object Dependencies {
    val effect: Seq[ModuleID] = Seq(
      "org.typelevel" %% "cats-core"   % versions.cats,
      "org.typelevel" %% "cats-effect" % versions.catsEffect,
      "co.fs2"        %% "fs2-core"    % versions.fs2
    )

    val model: Seq[ModuleID] = Seq(
      "com.comcast"        %% "ip4s-core"  % versions.ip4s,
      "io.github.iltotore" %% "iron"       % versions.iron,
//      "io.github.iltotore" %% "iron-cats"    % versions.iron,
      "io.github.iltotore" %% "iron-circe" % versions.iron
//      "io.github.iltotore" %% "iron-decline" % versions.iron
    )

    val decline: Seq[ModuleID] = Seq(
      "com.monovore" %% "decline" % versions.decline
    )

    val json: Seq[ModuleID] = Seq(
      "io.circe" %% "circe-core" % versions.circe,
//      "io.circe" %% "circe-generic" % versions.circe,
//      "io.circe" %% "circe-parser"  % versions.circe,
      "io.circe" %% "circe-yaml" % versions.circeYaml
    )

    val http4s: Seq[ModuleID] = Seq(
      "org.http4s" %% "http4s-core" % versions.http4s
    )

    val http4sClient: Seq[ModuleID] = Seq(
      "org.http4s"                  %% "http4s-ember-client" % versions.http4s,
      "com.softwaremill.sttp.tapir" %% "tapir-http4s-client" % versions.tapir,
      "com.alejandrohdezma"         %% "http4s-munit"        % versions.munit.http4s % Test
    )
    val http4sServer: Seq[ModuleID] = Seq(
      "org.http4s" %% "http4s-ember-server" % versions.http4s
    )
    val scodec: Seq[ModuleID]       = Seq(
      "org.scodec" %% "scodec-bits" % versions.scodec.bits,
      "org.scodec" %% "scodec-core" % versions.scodec.core
    )

    val tapir: Seq[ModuleID]     = Seq(
      "com.softwaremill.sttp.tapir" %% "tapir-http4s-server"     % versions.tapir,
      "com.softwaremill.sttp.tapir" %% "tapir-json-circe"        % versions.tapir,
//      "com.softwaremill.sttp.tapir" %% "tapir-opentelemetry-metrics" % versions.tapir,
      "com.softwaremill.sttp.tapir" %% "tapir-openapi-docs"      % versions.tapir,
      "com.softwaremill.sttp.tapir" %% "tapir-swagger-ui-bundle" % versions.tapir,
      "com.softwaremill.sttp.tapir" %% "tapir-sttp-stub-server"  % versions.tapir % Test
    )
    val tapirIron: Seq[ModuleID] = Seq(
      "com.softwaremill.sttp.tapir" %% "tapir-iron" % versions.tapir
    )

    val logging: Seq[ModuleID] = Seq( //
      "com.outr" %% "scribe"            % versions.scribe,
      "com.outr" %% "scribe-cats"       % versions.scribe,
      "com.outr" %% "scribe-slf4j"      % versions.scribe % Runtime,
      "com.outr" %% "scribe-json-circe" % versions.scribe,
      "com.outr" %% "scribe-file"       % versions.scribe
    )

    val munit: Seq[ModuleID] = Seq(
      "org.scalameta" %% "munit"             % versions.munit.core,
      "org.typelevel" %% "munit-cats-effect" % versions.munit.catsEffect
    )

    val scalaCheck: Seq[ModuleID] = Seq(
      "org.scalameta"      %% "munit-scalacheck" % versions.munit.scalacheck,
      "io.github.iltotore" %% "iron-scalacheck"  % versions.iron
    )
    val tests: Seq[ModuleID]      = (munit ++ scalaCheck).map(_ % Test)

    val testContainers: Seq[ModuleID] = Seq(
      "com.dimafeng" %% "testcontainers-scala-munit" % versions.testContainers
    )

    val testContainersJdbc: Seq[ModuleID] = testContainers ++ Seq(
      "com.dimafeng" %% "testcontainers-scala-jdbc" % versions.testContainers
    )

    val testContainersPostgres: Seq[ModuleID] = testContainers ++ Seq(
      "com.dimafeng" %% "testcontainers-scala-postgresql" % versions.testContainers
    )

    val testContainersRabbit: Seq[ModuleID] = testContainers ++ Seq(
      "com.dimafeng" %% "testcontainers-scala-rabbitmq" % versions.testContainers
    )

    val testContainersRedis: Seq[ModuleID] = testContainers ++ Seq(
      "com.dimafeng" %% "testcontainers-scala-redis" % versions.testContainers
    )

    val observability: Seq[ModuleID] = Seq(
      "org.typelevel" %% "otel4s-sdk"          % versions.otel4s,
      "org.typelevel" %% "otel4s-sdk-exporter" % versions.otel4s
    )

    val skunk: Seq[ModuleID] = Seq(
      "org.tpolecat" %% "skunk-core" % versions.skunk
    )

    val doobie: Seq[ModuleID] = Seq(
      "org.tpolecat" %% "doobie-core"   % versions.doobie,
      "org.tpolecat" %% "doobie-hikari" % versions.doobie // HikariCP transactor.
    )

    val migrationsRuntime: Seq[ModuleID] = Seq(
      "org.postgresql" % "postgresql"                 % versions.postgresqlDriver % Runtime,
      "org.flywaydb"   % "flyway-database-postgresql" % versions.flyway           % Runtime
    )
    val migrations: Seq[ModuleID]        = Seq(
      "org.flywaydb" % "flyway-core" % versions.flyway
    )

    val fs2Rabbit: Seq[ModuleID] = Seq(
      "dev.profunktor" %% "fs2-rabbit" % versions.fs2Rabbit
    )

    val rediculous: Seq[ModuleID] = Seq(
      "io.chrisdavenport" %% "rediculous" % versions.rediculous
    )

    val literally: Seq[ModuleID] = Seq(
      "org.typelevel" %% "literally" % versions.literally
    )
}
