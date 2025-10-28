# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [v0.5.2-RC10] - 2025-10-28
### :wrench: Chores
- [`010d6d3`](https://github.com/LedgerHQ/pillars/commit/010d6d375e9913c636002b1b91d17bdad712b6ff) - Update doobie-core, doobie-hikari from 1.0.0-RC9 to 1.0.0-RC10 *(PR [#6](https://github.com/LedgerHQ/pillars/pull/6) by [@ldg-github-ci](https://github.com/ldg-github-ci))*
- [`421227e`](https://github.com/LedgerHQ/pillars/commit/421227e51c5dbea058cbf7451b1ad17713ab6cd8) - Update skunk-core from 1.0.0-M10 to 1.0.0-M11 *(PR [#7](https://github.com/LedgerHQ/pillars/pull/7) by [@ldg-github-ci](https://github.com/ldg-github-ci))*
- [`23072eb`](https://github.com/LedgerHQ/pillars/commit/23072eb24a399e9535062f3b2980349119913b16) - Update otel4s-sdk, otel4s-sdk-exporter from 0.12.0 to 0.13.1 *(PR [#8](https://github.com/LedgerHQ/pillars/pull/8) by [@ldg-github-ci](https://github.com/ldg-github-ci))*
- [`eff5b7b`](https://github.com/LedgerHQ/pillars/commit/eff5b7b8bd0eb3bb8c510eded167e9f25d57b2a3) - Update fs2-core from 3.12.0 to 3.12.2
- [`632ec73`](https://github.com/LedgerHQ/pillars/commit/632ec7386a03b1470690aaaa6a6229eb403521fa) - Update ip4s-core from 3.6.0 to 3.7.0
- [`030ce19`](https://github.com/LedgerHQ/pillars/commit/030ce197bf495eaf32472bf0ec59ef16f5889398) - Update sbt-dynver from 5.1.0 to 5.1.1
- [`af4df85`](https://github.com/LedgerHQ/pillars/commit/af4df85dd4efa6fef144b92e80a343b57b1d427a) - Update scribe from 3.16.0 to 3.16.1
- [`01ca632`](https://github.com/LedgerHQ/pillars/commit/01ca63254a08db2900743494aa2b2f298580be95) - Update tapir-http4s-client from 1.11.32 to 1.11.44
- [`7e7606a`](https://github.com/LedgerHQ/pillars/commit/7e7606aaa56028103b93e18c189916022cfc966a) - Update circe-core from 0.14.12 to 0.14.14
- [`496f262`](https://github.com/LedgerHQ/pillars/commit/496f262388b6a6bf2a49f79052c2e0fd540fdbf5) - Update circe-yaml from 0.16.0 to 0.16.1
- [`cf3d11d`](https://github.com/LedgerHQ/pillars/commit/cf3d11daabb7803394b3a5774c7f58647bb8cc4b) - Update flyway-core from 11.5.0 to 11.13.0
- [`58e26b4`](https://github.com/LedgerHQ/pillars/commit/58e26b4a8923d273df46dbd32c233bacab688fdf) - Update postgresql from 42.7.5 to 42.7.7
- [`f092e95`](https://github.com/LedgerHQ/pillars/commit/f092e95e7d0a873b800854927d10010fb16a1ed4) - Update sbt from 1.10.11 to 1.11.6
- [`1852a22`](https://github.com/LedgerHQ/pillars/commit/1852a22d8abed71cb4c9477751d19b0206fccfad) - Update munit from 1.1.0 to 1.1.2
- [`7537116`](https://github.com/LedgerHQ/pillars/commit/7537116b01be20d282785da417afa5453e90e791) - Update munit-scalacheck from 1.1.0 to 1.2.0
- [`5292929`](https://github.com/LedgerHQ/pillars/commit/529292962f76abcbeb061c1b2f3eecdc2884c6dc) - Update cats-effect from 3.6.0 to 3.6.3
- [`fa2c722`](https://github.com/LedgerHQ/pillars/commit/fa2c7224cd42fd6d7a575d11c88017766e08ef17) - Patches/Minor updates *(PR [#10](https://github.com/LedgerHQ/pillars/pull/10) by [@ldg-github-ci](https://github.com/ldg-github-ci))*


## [v0.5.2-RC9] - 2025-07-22
### :wrench: Chores
- [`e159f4f`](https://github.com/LedgerHQ/pillars/commit/e159f4f9ee00307ec2dba5913a88b9ab905c9173) - **BACK-9362**: switch from netty to ember *(commit by [@jnicoulaud-ledger](https://github.com/jnicoulaud-ledger))*


## [v0.5.2-RC8] - 2025-04-30
### :wrench: Chores
- [`2244fbc`](https://github.com/LedgerHQ/pillars/commit/2244fbcdbdb436c09ae3632a176dea4e09527dae) - revert config to kebab case *(commit by [@jnicoulaud-ledger](https://github.com/jnicoulaud-ledger))*


## [v0.5.2-RC1] - 2025-04-29
### :boom: BREAKING CHANGES
- due to [`c56f3b9`](https://github.com/LedgerHQ/pillars/commit/c56f3b9c971a6d425a6dbd60cbefccbc4a0ef653) - migrate from tagless final to IO-based implementation *(PR [#225](https://github.com/LedgerHQ/pillars/pull/225) by [@rlemaitre](https://github.com/rlemaitre))*:

  This changes the fundamental abstraction approach from  
  tagless final (F[_]) to concrete IO type, requiring API consumers to adapt  
  their code accordingly.


### :sparkles: New Features
- [`c56f3b9`](https://github.com/LedgerHQ/pillars/commit/c56f3b9c971a6d425a6dbd60cbefccbc4a0ef653) - migrate from tagless final to IO-based implementation *(PR [#225](https://github.com/LedgerHQ/pillars/pull/225) by [@rlemaitre](https://github.com/rlemaitre))*
- [`e097b16`](https://github.com/LedgerHQ/pillars/commit/e097b16a978b9626de0cc4e7b07477c1ddcc5877) - **core**: improve error handling and type safety *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`d52934b`](https://github.com/LedgerHQ/pillars/commit/d52934ba63907aef2cec04812e57b4ddc88f8568) - make HTTP client metrics optional *(commit by [@jnicoulaud-ledger](https://github.com/jnicoulaud-ledger))*

### :wrench: Chores
- [`be54864`](https://github.com/LedgerHQ/pillars/commit/be54864887b21efa5548fe30b69c63d5315cc7a1) - Patches/Minor updates *(PR [#222](https://github.com/LedgerHQ/pillars/pull/222) by [@scala-steward](https://github.com/scala-steward))*
- [`1055ca0`](https://github.com/LedgerHQ/pillars/commit/1055ca0619bdc7cb126d178cf7918dbad8e752c5) - **deps**: update otel4s to 0.12.0 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`56e9790`](https://github.com/LedgerHQ/pillars/commit/56e9790a0233eec124a2a225483fb4f3d4455360) - **deps**: update munit-cats-effect to 2.1.0 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`6245b6f`](https://github.com/LedgerHQ/pillars/commit/6245b6f00c68a9f90bfdd1826d2b5be81e448a5e) - Update doobie-core, doobie-hikari from 1.0.0-RC8 to 1.0.0-RC9 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`3ba4b5e`](https://github.com/LedgerHQ/pillars/commit/3ba4b5e98bdadc58acb5b071f7a788d6743a7dfe) - make skunk tracing optional (off by default) *(commit by [@jnicoulaud-ledger](https://github.com/jnicoulaud-ledger))*


## [v0.5.1] - 2025-03-19
### :sparkles: New Features
- [`f409b88`](https://github.com/FunktionalIO/pillars/commit/f409b88cb3c4fa285c9c6cbf32818999a867d1d9) - upgrade source to scala 3.6 syntax *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`a18bfff`](https://github.com/FunktionalIO/pillars/commit/a18bfffcd56be5eca3ebd3d69edc26d366735683) - add traces in probe checks *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`d5432d1`](https://github.com/FunktionalIO/pillars/commit/d5432d1409dc2e00c4d2e7e74d201dd0c07aba88) - **observability**: join distributed trace when opening endpoint spans *(commit by [@rlemaitre](https://github.com/rlemaitre))*

### :bug: Bug Fixes
- [`96ad225`](https://github.com/FunktionalIO/pillars/commit/96ad2251499177b591426d43683b9255ecdc3fb6) - mark correctly span as errors when exception *(commit by [@rlemaitre](https://github.com/rlemaitre))*

### :wrench: Chores
- [`6047287`](https://github.com/FunktionalIO/pillars/commit/60472872aa334053dfb515a70090088764dad754) - **deps**: update ncipollo/release-action to 1.16.0 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`3c3b9ee`](https://github.com/FunktionalIO/pillars/commit/3c3b9ee3a298e48b7f4f3b8e2f85127f46a6ee65) - Update testcontainers-scala-jdbc, ... from 0.41.8 to 0.43.0 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`6c4cb00`](https://github.com/FunktionalIO/pillars/commit/6c4cb00d40991bfa689cd40b140cb7b466bce330) - Upgrade tapir from 1.11.17 to 1.11.19, circe from 0.14.10 to 0.14.12, flywaydb from 11.3.4 to 11.4.0, sbt from 1.10.10 to 1.10.11, scalafmt from 3.9.3 to 3.9.4 *(PR [#221](https://github.com/FunktionalIO/pillars/pull/221) by [@scala-steward](https://github.com/scala-steward))*
- [`1a6e8c1`](https://github.com/FunktionalIO/pillars/commit/1a6e8c14942c1785185824437605fb0f2c25b8fc) - Upgrade to scala 3.6.4 *(commit by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.5.0] - 2025-03-09
### :boom: BREAKING CHANGES
- due to [`026041c`](https://github.com/FunktionalIO/pillars/commit/026041cc843e2c5c2a86378b8ae6617fed715712) - Move to io.funktional org *(PR [#218](https://github.com/FunktionalIO/pillars/pull/218) by [@rlemaitre](https://github.com/rlemaitre))*:

  users will need to modify their dependencies  
  to io.funktional


### :wrench: Chores
- [`0fbbcb9`](https://github.com/FunktionalIO/pillars/commit/0fbbcb9b94cd076b8f9cc66fa0bd6a104cefa822) - Update doobie-core, doobie-hikari from 1.0.0-RC6 to 1.0.0-RC7 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`3bdc486`](https://github.com/FunktionalIO/pillars/commit/3bdc4869ebffb91953008ee901df28f092998b8f) - Patches/Minor updates *(PR [#203](https://github.com/FunktionalIO/pillars/pull/203) by [@scala-steward](https://github.com/scala-steward))*
- [`ba1c3da`](https://github.com/FunktionalIO/pillars/commit/ba1c3dab88193f42bd157ea2a5459c3962874c65) - Update flyway-core from 11.3.1 to 11.3.2 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`1cebd0a`](https://github.com/FunktionalIO/pillars/commit/1cebd0a1cd212c0ea6e37e51fbc0f62711222062) - Update tapir-http4s-client from 1.11.14 to 1.11.17 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`9b65e5b`](https://github.com/FunktionalIO/pillars/commit/9b65e5b49160c28504e886f0131703479ced48fe) - Update flyway-core from 11.3.2 to 11.3.4 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`0ff5093`](https://github.com/FunktionalIO/pillars/commit/0ff5093562874f2331851169c2ee16020cc9b8c3) - Update sbt from 1.10.7 to 1.10.10 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`01f1ab2`](https://github.com/FunktionalIO/pillars/commit/01f1ab295f08ae7dde12db81abb4e3f9fb0725aa) - Update scalafmt-core from 3.8.6 to 3.9.2 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`5264f0a`](https://github.com/FunktionalIO/pillars/commit/5264f0a4cf4509065b5ead4da92e079746195f09) - Update doobie-core, doobie-hikari from 1.0.0-RC7 to 1.0.0-RC8 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`c4af955`](https://github.com/FunktionalIO/pillars/commit/c4af9552e2abcf4b40d39bb4c9501c86c44fd403) - Update scalafmt-core from 3.9.2 to 3.9.3 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`026041c`](https://github.com/FunktionalIO/pillars/commit/026041cc843e2c5c2a86378b8ae6617fed715712) - **release**: Move to io.funktional org *(PR [#218](https://github.com/FunktionalIO/pillars/pull/218) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.4.5] - 2025-01-26
### :sparkles: New Features
- [`5818ca1`](https://github.com/FunktionalIO/pillars/commit/5818ca1a1e704ba172314d68616ad03d1623d85b) - [#209](https://github.com/FunktionalIO/pillars/pull/209) add custom attibutes from config for metrics & traces *(PR [#210](https://github.com/FunktionalIO/pillars/pull/210) by [@moronyoh](https://github.com/moronyoh))*

### :wrench: Chores
- [`ec81efd`](https://github.com/FunktionalIO/pillars/commit/ec81efd33d3ad5302e1e60074ec8be3e5afae8df) - Update skunk-core from 1.0.0-M8 to 1.0.0-M10 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`1d6d562`](https://github.com/FunktionalIO/pillars/commit/1d6d562bf4d4db0dcb46f4ee25b78e5829cdf038) - Update cats-core from 2.12.0 to 2.13.0 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`32c1c8e`](https://github.com/FunktionalIO/pillars/commit/32c1c8ebbcd347ed818ac6daa24c3ba1744d2221) - Update scalafmt-core from 3.8.3 to 3.8.6 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`fa14ce4`](https://github.com/FunktionalIO/pillars/commit/fa14ce499b1a7b720438574e36d3b7ae9e106366) - Update munit-scalacheck from 1.0.0 to 1.1.0 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`545a745`](https://github.com/FunktionalIO/pillars/commit/545a7458ffb3a474c37d538ead26102d8127e194) - Update munit from 1.0.4 to 1.1.0 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`0f76a37`](https://github.com/FunktionalIO/pillars/commit/0f76a37b05c1970d707fe1b01b5931ffb2b0c015) - Update sbt from 1.10.6 to 1.10.7 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`d92d589`](https://github.com/FunktionalIO/pillars/commit/d92d589bc8cae2582e2e27c8ffe0b710b9b49c96) - Update postgresql from 42.7.4 to 42.7.5 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`562b036`](https://github.com/FunktionalIO/pillars/commit/562b036fe02f85a47027b030d009097fe730ae9f) - Update http4s-netty-client from 0.5.21 to 0.5.22 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`569bd6c`](https://github.com/FunktionalIO/pillars/commit/569bd6c7a44ac6f7b1570894b5ef96c34829d385) - Update http4s-netty-client from 0.5.21 to 0.5.22 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`914e218`](https://github.com/FunktionalIO/pillars/commit/914e218d3d21ef55e795bd01ab6723018058de02) - Update fs2-rabbit from 5.3.0 to 5.4.0 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`49de924`](https://github.com/FunktionalIO/pillars/commit/49de924c7d970b00fca98036559910e57dbf6ac8) - Update tapir-http4s-client from 1.11.10 to 1.11.13 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`ac26429`](https://github.com/FunktionalIO/pillars/commit/ac264292adf60333ffc53a5a9c35d35bd8067336) - Update scribe from 3.15.3 to 3.16.0 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`2be78cc`](https://github.com/FunktionalIO/pillars/commit/2be78cc22df255cfb7c029578d5959d8c232d3b2) - Update decline from 2.4.1 to 2.5.0 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`95035b6`](https://github.com/FunktionalIO/pillars/commit/95035b685328a33ca41db339630079f93b6a8089) - Update testcontainers-scala-jdbc from 0.41.5 to 0.41.8 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`7a1a6a6`](https://github.com/FunktionalIO/pillars/commit/7a1a6a6d7a2b6cf127e861172065084aa5fbcfde) - Upgrade to scala 3.6.3 *(commit by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.4.4] - 2025-01-14
### :sparkles: New Features
- [`259f46e`](https://github.com/FunktionalIO/pillars/commit/259f46ea6b4bec4ec31ecab29f752d0e9355f175) - [#168](https://github.com/FunktionalIO/pillars/pull/168) Add test suite allowing easy pillars testing *(PR [#207](https://github.com/FunktionalIO/pillars/pull/207) by [@rlemaitre](https://github.com/rlemaitre))*
  - :arrow_lower_right: *addresses issue [#168](https://github.com/FunktionalIO/pillars/issues/168) opened by [@rlemaitre](https://github.com/rlemaitre)*

### :bug: Bug Fixes
- [`dadeb49`](https://github.com/FunktionalIO/pillars/commit/dadeb494e99bfc333c8426f6e07a8ab070519e13) - **core**: [#204](https://github.com/FunktionalIO/pillars/pull/204) Use enabled config from traces & metrics to configure observability *(PR [#206](https://github.com/FunktionalIO/pillars/pull/206) by [@moronyoh](https://github.com/moronyoh))*

### :wrench: Chores
- [`0b36953`](https://github.com/FunktionalIO/pillars/commit/0b36953e83f9f6bac866e7330ee68f1261b11e5b) - Update circe-yaml from 0.15.1 to 0.15.3 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`adf1503`](https://github.com/FunktionalIO/pillars/commit/adf1503ad7529ac36f121ca836ef3fd3a74717c1) - Update http4s-circe from 0.23.29 to 0.23.30 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`5bdc623`](https://github.com/FunktionalIO/pillars/commit/5bdc6234d9c6f1f33e5dd2b6f11e54f633a4a4b3) - Update http4s-core from 0.23.29 to 0.23.30 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`8e65e5f`](https://github.com/FunktionalIO/pillars/commit/8e65e5fb77a45ef3080c76bb4053ceeced8f9109) - Update http4s-dsl from 0.23.29 to 0.23.30 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`a4eaa96`](https://github.com/FunktionalIO/pillars/commit/a4eaa964c3c8cff3116eada7031b12bab7762291) - **core**: Configure Scala Steward to not upgrade Scala 3 *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`5c31e65`](https://github.com/FunktionalIO/pillars/commit/5c31e654abc30125c03fbaea49a606b81669d8ee) - Update testcontainers-scala-munit from 0.41.4 to 0.41.5 *(commit by [@scala-steward](https://github.com/scala-steward))*


## [v0.4.2] - 2024-12-05
### :bug: Bug Fixes
- [`20db934`](https://github.com/FunktionalIO/pillars/commit/20db934af474f566f2a6b2073d547403b82c4e64) - **core**: Use default CORS policy *(commit by [@rlemaitre](https://github.com/rlemaitre))*

### :wrench: Chores
- [`440f987`](https://github.com/FunktionalIO/pillars/commit/440f98770179236be31e9eb54018627157a1c85a) - Downgrade circe-yaml to 0.15.1 *(commit by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.4.1] - 2024-12-04
### :wrench: Chores
- [`a88062e`](https://github.com/FunktionalIO/pillars/commit/a88062e329e3df13bf9cf74ebd1c11e34e896429) - Patches/Minor updates *(PR [#194](https://github.com/FunktionalIO/pillars/pull/194) by [@scala-steward](https://github.com/scala-steward))*


## [v0.4.0] - 2024-12-04
### :boom: BREAKING CHANGES
- due to [`7077b72`](https://github.com/FunktionalIO/pillars/commit/7077b72724dba0688a219fe530ab85d808dba329) - [#188](https://github.com/FunktionalIO/pillars/pull/188) Make module loading explicit *(PR [#189](https://github.com/FunktionalIO/pillars/pull/189) by [@rlemaitre](https://github.com/rlemaitre))*:

  Module Management  
  The way modules are defined and used changed in this version. To migrate from a prior version, you will have to change the base class of your app and explicitely declare what optional module your aer using. For more information, see the Quickstart section of the documentation.


### :recycle: Refactors
- [`7077b72`](https://github.com/FunktionalIO/pillars/commit/7077b72724dba0688a219fe530ab85d808dba329) - [#188](https://github.com/FunktionalIO/pillars/pull/188) Make module loading explicit *(PR [#189](https://github.com/FunktionalIO/pillars/pull/189) by [@rlemaitre](https://github.com/rlemaitre))*

### :wrench: Chores
- [`f0bb12a`](https://github.com/FunktionalIO/pillars/commit/f0bb12a2d383a4f2c65e446895cd094d41a881aa) - Change license from APL-2.0 to EPL-2.0 *(PR [#190](https://github.com/FunktionalIO/pillars/pull/190) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.3.23] - 2024-12-02
### :wrench: Chores
- [`c488ccf`](https://github.com/FunktionalIO/pillars/commit/c488ccfaee9c9309d06ab98a3fc017781c79f123) - Update sbt from 1.10.5 to 1.10.6 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`378f780`](https://github.com/FunktionalIO/pillars/commit/378f780a07c383bc365aac4ec8f48fbe826049d3) - Update otel4s-sdk from 0.11.1 to 0.11.2 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`d65f922`](https://github.com/FunktionalIO/pillars/commit/d65f922de546a3c0602dd443694558caf9122d77) - Update otel4s-sdk-exporter from 0.11.1 to 0.11.2 *(commit by [@scala-steward](https://github.com/scala-steward))*


## [v0.3.22] - 2024-11-29
### :bug: Bug Fixes
- [`3762306`](https://github.com/FunktionalIO/pillars/commit/37623065606aa8afe701f88ea5b47169515605d5) - **doc**: admin urls *(commit by [@jprudent](https://github.com/jprudent))*


## [v0.3.21] - 2024-11-29
### :wrench: Chores
- [`7898344`](https://github.com/FunktionalIO/pillars/commit/7898344c9a90a5538c406914dcd4f29d4fb78221) - Update cats-effect from 3.5.6 to 3.5.7 *(commit by [@scala-steward](https://github.com/scala-steward))*


## [v0.3.20] - 2024-11-25
### :wrench: Chores
- [`4d97131`](https://github.com/rlemaitre/pillars/commit/4d971317f5d94bdfae5a644f3010c663d73ccde3) - Update sbt-ci-release-early from 2.0.46 to 2.0.48 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`17d38bd`](https://github.com/rlemaitre/pillars/commit/17d38bd094abb11a15c9fe25ffaf99ebc6c999b5) - Update sbt from 1.10.4 to 1.10.5 *(commit by [@scala-steward](https://github.com/scala-steward))*


## [v0.3.18] - 2024-11-25
### :wrench: Chores
- [`02c8132`](https://github.com/rlemaitre/pillars/commit/02c81329bb4840d063a39f48db34f5372eb7f507) - upgrade dependencies *(PR [#183](https://github.com/rlemaitre/pillars/pull/183) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.3.11] - 2024-09-23
### :wrench: Chores
- [`948536d`](https://github.com/rlemaitre/pillars/commit/948536da955b77737b9f26ae16bbfa379cd1dd90) - Update doobie-core, doobie-hikari from 1.0.0-RC5 to 1.0.0-RC6 *(commit by [@scala-steward](https://github.com/scala-steward))*


## [v0.3.10] - 2024-09-21
### :wrench: Chores
- [`4fd626f`](https://github.com/rlemaitre/pillars/commit/4fd626f8c82159e3a7bfb8d96f1768d950583e33) - Update tapir-http4s-client from 1.11.3 to 1.11.4 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`1eab0e5`](https://github.com/rlemaitre/pillars/commit/1eab0e5e4132f9d290f3c85db0ddcdb161c7d721) - Update tapir-http4s-server from 1.11.3 to 1.11.4 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`ee81b82`](https://github.com/rlemaitre/pillars/commit/ee81b82bb8a428bc95d0053a5e31617f1cac188d) - Update tapir-iron from 1.11.3 to 1.11.4 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`6c265d3`](https://github.com/rlemaitre/pillars/commit/6c265d31f814bf1a7985d9cc8ace5e172bf1b99d) - Update tapir-json-circe from 1.11.3 to 1.11.4 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`44a9cc3`](https://github.com/rlemaitre/pillars/commit/44a9cc3d578883c3ba2104926015c2f5c2d12419) - Update tapir-openapi-docs from 1.11.3 to 1.11.4 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`46bcfd1`](https://github.com/rlemaitre/pillars/commit/46bcfd1645ecf9a1b84924426845ec017abcbd84) - Update tapir-opentelemetry-metrics from 1.11.3 to 1.11.4 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`757ef99`](https://github.com/rlemaitre/pillars/commit/757ef99d0d6cb4f73dd709647cb3a7fb773bc859) - Update tapir-sttp-stub-server from 1.11.3 to 1.11.4 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`8ca814b`](https://github.com/rlemaitre/pillars/commit/8ca814be4d7b2dc353b056484dfef01e681fe71d) - Update tapir-swagger-ui-bundle from 1.11.3 to 1.11.4 *(commit by [@scala-steward](https://github.com/scala-steward))*


## [v0.3.9] - 2024-09-17
### :sparkles: New Features
- [`0cd16d4`](https://github.com/rlemaitre/pillars/commit/0cd16d4047d740f1d3d0b08503bf6aca16f91f95) - **rabbit**: [#166](https://github.com/rlemaitre/pillars/pull/166) allow using multiple rabbitmq hosts *(PR [#167](https://github.com/rlemaitre/pillars/pull/167) by [@rlemaitre](https://github.com/rlemaitre))*
  - :arrow_lower_right: *addresses issue [#166](https://github.com/rlemaitre/pillars/issues/166) opened by [@rlemaitre](https://github.com/rlemaitre)*


## [v0.3.8] - 2024-09-17
### :sparkles: New Features
- [`8a13b2a`](https://github.com/rlemaitre/pillars/commit/8a13b2a19e8aa76b496d664404639320007c3684) - **core**: Add RunIO[A] type alias for Run[IO, A] *(commit by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.3.7] - 2024-09-17
### :wrench: Chores
- [`18d188d`](https://github.com/rlemaitre/pillars/commit/18d188de2e1b5b12fd8bfd56b21440532d1304bc) - Update sbt from 1.10.1 to 1.10.2 *(commit by [@scala-steward](https://github.com/scala-steward))*


## [v0.3.6] - 2024-09-16
### :wrench: Chores
- [`76266d8`](https://github.com/rlemaitre/pillars/commit/76266d8c7bd0d1072eeaea948166dd4eec6a11ff) - Update tapir-http4s-client from 1.11.2 to 1.11.3 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`214a8e3`](https://github.com/rlemaitre/pillars/commit/214a8e309eb54f325f794d8113d35451ad410858) - Update tapir-http4s-server from 1.11.2 to 1.11.3 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`2fd8c05`](https://github.com/rlemaitre/pillars/commit/2fd8c05f862573e65fccc8fc6bbeeeb95f304e21) - Update tapir-iron from 1.11.2 to 1.11.3 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`c2e9feb`](https://github.com/rlemaitre/pillars/commit/c2e9feb2de44f96e535112852f360500b318806e) - Update tapir-json-circe from 1.11.2 to 1.11.3 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`3f4ea30`](https://github.com/rlemaitre/pillars/commit/3f4ea302cae608509fcfcb582bb9d34c063a99d8) - Update tapir-openapi-docs from 1.11.2 to 1.11.3 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`27a7ed1`](https://github.com/rlemaitre/pillars/commit/27a7ed142de02eedbd5c3cc33b4915d3725b70a8) - Update tapir-opentelemetry-metrics from 1.11.2 to 1.11.3 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`1aee1ab`](https://github.com/rlemaitre/pillars/commit/1aee1abf4eb799b79aad9a5cea2d25f2ed4d7f73) - Update tapir-sttp-stub-server from 1.11.2 to 1.11.3 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`65e50d1`](https://github.com/rlemaitre/pillars/commit/65e50d11f36a8355b28330285536417e9694f9c4) - Update tapir-swagger-ui-bundle from 1.11.2 to 1.11.3 *(commit by [@scala-steward](https://github.com/scala-steward))*
- [`c8f7e61`](https://github.com/rlemaitre/pillars/commit/c8f7e61fc02b3bf455f1a71ab1212d3c888e118d) - Update munit from 1.0.1 to 1.0.2 *(commit by [@scala-steward](https://github.com/scala-steward))*


## [v0.3.5] - 2024-09-13
### :sparkles: New Features
- [`ccd8370`](https://github.com/rlemaitre/pillars/commit/ccd837040f703b215e77d12a3ede3b9e786ee14a) - **http-client**: Make HttpClient inherit from Client *(commit by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.3.4] - 2024-09-12
### :sparkles: New Features
- [`776ac24`](https://github.com/rlemaitre/pillars/commit/776ac242d41bc7da1c9daf3eefc0a0cdc79c5577) - [#159](https://github.com/rlemaitre/pillars/pull/159) Expose config of optional modules *(commit by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.3.3] - 2024-09-12
### :wrench: Chores
- [`9ca6472`](https://github.com/rlemaitre/pillars/commit/9ca6472a384ab7225b96d9b49e389bf59ca312e6) - Patches/Minor updates *(PR [#160](https://github.com/rlemaitre/pillars/pull/160) by [@scala-steward](https://github.com/scala-steward))*


## [v0.3.2] - 2024-09-10
### :wrench: Chores
- [`555f4b5`](https://github.com/rlemaitre/pillars/commit/555f4b5090fe8d685a2af227ab93b47daf3b0f09) - Patches/Minor updates *(PR [#154](https://github.com/rlemaitre/pillars/pull/154) by [@scala-steward](https://github.com/scala-steward))*


## [v0.2.32] - 2024-09-09
### :sparkles: New Features
- [`701bf0f`](https://github.com/rlemaitre/pillars/commit/701bf0fb6a8e13c2733c983725baa67bdc949612) - **core**: improve type inference on the F type *(PR [#152](https://github.com/rlemaitre/pillars/pull/152) by [@vbergeron](https://github.com/vbergeron))*


## [v0.2.31] - 2024-09-09
### :wrench: Chores
- [`cb8cffd`](https://github.com/rlemaitre/pillars/commit/cb8cffd7f8f26b0dc1c01b39408e353bcc054797) - Patches/Minor updates *(PR [#150](https://github.com/rlemaitre/pillars/pull/150) by [@scala-steward](https://github.com/scala-steward))*


## [v0.2.30] - 2024-09-09
### :sparkles: New Features
- [`34f0770`](https://github.com/rlemaitre/pillars/commit/34f07707b8f237b4cc685a1add07992e7590684b) - **core**: [#126](https://github.com/rlemaitre/pillars/pull/126) Add traces for HTTP servers and client endpoints *(PR [#153](https://github.com/rlemaitre/pillars/pull/153) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.2.28] - 2024-09-05
### :sparkles: New Features
- [`d502b6f`](https://github.com/rlemaitre/pillars/commit/d502b6f99c7eb98a6b1a349c8fa8e995c554d000) - **api-server**: can be built from controllers *(PR [#149](https://github.com/rlemaitre/pillars/pull/149) by [@vbergeron](https://github.com/vbergeron))*


## [v0.2.27] - 2024-09-03
### :wrench: Chores
- [`ac5b18c`](https://github.com/rlemaitre/pillars/commit/ac5b18cd24baa6263ac0182d29e06cab98465c54) - Patches/Minor updates *(PR [#147](https://github.com/rlemaitre/pillars/pull/147) by [@scala-steward](https://github.com/scala-steward))*


## [v0.2.26] - 2024-08-22
### :wrench: Chores
- [`39e1ae3`](https://github.com/rlemaitre/pillars/commit/39e1ae33154d9430f9c745038c0c3daa63f67293) - Add labels to issue templates and add documentation template *(PR [#145](https://github.com/rlemaitre/pillars/pull/145) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.2.23] - 2024-08-22
### :wrench: Chores
- [`c2da005`](https://github.com/rlemaitre/pillars/commit/c2da00542b0cd52e9d864f738e506957909b1080) - Add templates for issues *(PR [#144](https://github.com/rlemaitre/pillars/pull/144) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.2.22] - 2024-08-20
### :wrench: Chores
- [`2f7c511`](https://github.com/rlemaitre/pillars/commit/2f7c51169e15a0fca376c9818147a261c8997f6b) - Patches/Minor updates *(PR [#142](https://github.com/rlemaitre/pillars/pull/142) by [@scala-steward](https://github.com/scala-steward))*


## [v0.2.21] - 2024-08-10
### :bug: Bug Fixes
- [`5c8ad04`](https://github.com/rlemaitre/pillars/commit/5c8ad042e83b2c676a10635bf8f07957bbb8e1ef) - **docs**: Fix project name replacement in overview *(PR [#141](https://github.com/rlemaitre/pillars/pull/141) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.2.18] - 2024-08-07
### :wrench: Chores
- [`e6eac0d`](https://github.com/rlemaitre/pillars/commit/e6eac0de122d0410e7c0fef2cd0df0169ac4fa1f) - Patches/Minor updates *(PR [#138](https://github.com/rlemaitre/pillars/pull/138) by [@scala-steward](https://github.com/scala-steward))*


## [v0.2.16] - 2024-08-07
### :sparkles: New Features
- [`84bad0c`](https://github.com/rlemaitre/pillars/commit/84bad0c12adf4f6aea9f3954861c2f9d10237a5b) - **db-skunk**: Allow session configuration *(PR [#140](https://github.com/rlemaitre/pillars/pull/140) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.2.15] - 2024-07-26
### :wrench: Chores
- [`c4b66a3`](https://github.com/rlemaitre/pillars/commit/c4b66a34aedae06b58c21fcf1d191c3961248f4f) - Upgrade Github Actions versions *(commit by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.2.0] - 2024-07-23
### :boom: BREAKING CHANGES
- due to [`c49773d`](https://github.com/rlemaitre/pillars/commit/c49773de50b466bfb5769f61fba0141932df0b19) - Rename db to db-skunk *(PR [#95](https://github.com/rlemaitre/pillars/pull/95) by [@rlemaitre](https://github.com/rlemaitre))*:

  dependencies have to be updated to `pillars-db-skunk` if you used `pillars-db`


### :sparkles: New Features
- [`82955ca`](https://github.com/rlemaitre/pillars/commit/82955ca34d66dbee8586b542a9e95fed2ecdc879) - **core**: Errors are returned in json *(PR [#102](https://github.com/rlemaitre/pillars/pull/102) by [@rlemaitre](https://github.com/rlemaitre))*
- [`bd47d89`](https://github.com/rlemaitre/pillars/commit/bd47d8968ea5262b2f0f57fc97bf18aabceac3a8) - Add metrics for http-client and http servers*(PR [#125](https://github.com/rlemaitre/pillars/pull/125) by [@rlemaitre](https://github.com/rlemaitre))*
  - :arrow_lower_right: *addresses issue [#35](https://github.com/rlemaitre/pillars/issues/35) opened by [@rlemaitre](https://github.com/rlemaitre)*
  - :arrow_lower_right: *addresses issue [#127](https://github.com/rlemaitre/pillars/issues/127) opened by [@rlemaitre](https://github.com/rlemaitre)*

### :recycle: Refactors
- [`c49773d`](https://github.com/rlemaitre/pillars/commit/c49773de50b466bfb5769f61fba0141932df0b19) - **db**: Rename db to db-skunk *(PR [#95](https://github.com/rlemaitre/pillars/pull/95) by [@rlemaitre](https://github.com/rlemaitre))*

### :wrench: Chores
- [`f309fdc`](https://github.com/rlemaitre/pillars/commit/f309fdc203e8b4c9eae3fb9d7a46ecc23ac1da8c) - Make Scala Steward follow conventional commits *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`dcf775c`](https://github.com/rlemaitre/pillars/commit/dcf775c5f2db75891d8939e222a1def845d86b6c) - Update openapi-circe-yaml from 0.7.4 to 0.8.0 *(PR [#89](https://github.com/rlemaitre/pillars/pull/89) by [@scala-steward](https://github.com/scala-steward))*
- [`1d74de5`](https://github.com/rlemaitre/pillars/commit/1d74de5c449aaab1222dc770353acd98d42f5f1f) - Patches/Minor updates *(PR [#92](https://github.com/rlemaitre/pillars/pull/92) by [@scala-steward](https://github.com/scala-steward))*
- [`a7df4e2`](https://github.com/rlemaitre/pillars/commit/a7df4e2a68baa0120cb4dd91ac05bcb46014e721) - Update sbt-buildinfo from 0.11.0 to 0.12.0 *(PR [#93](https://github.com/rlemaitre/pillars/pull/93) by [@scala-steward](https://github.com/scala-steward))*
- [`e5d3a95`](https://github.com/rlemaitre/pillars/commit/e5d3a95ea32557a33424cb7e36346fa66ef8351d) - Minor dependencies upgrade *(PR [#100](https://github.com/rlemaitre/pillars/pull/100) by [@rlemaitre](https://github.com/rlemaitre))*
- [`e7d8b34`](https://github.com/rlemaitre/pillars/commit/e7d8b34f89a093238456d6f16b25f73bd514bd9f) - Update munit-cats-effect from 2.0.0-M4 to 2.0.0-M5 *(PR [#97](https://github.com/rlemaitre/pillars/pull/97) by [@scala-steward](https://github.com/scala-steward))*
- [`b3ad72e`](https://github.com/rlemaitre/pillars/commit/b3ad72e37827b48fee9728c83209cdfdf9bda2c8) - Update openapi-circe-yaml from 0.8.0 to 0.9.0 *(PR [#98](https://github.com/rlemaitre/pillars/pull/98) by [@scala-steward](https://github.com/scala-steward))*
- [`04119ff`](https://github.com/rlemaitre/pillars/commit/04119ff3e81a994479e8875b01c7f20238f85db9) - Update munit, munit-scalacheck from 1.0.0-M11 to 1.0.0-M12 *(PR [#103](https://github.com/rlemaitre/pillars/pull/103) by [@scala-steward](https://github.com/scala-steward))*
- [`3603f53`](https://github.com/rlemaitre/pillars/commit/3603f53ba1ea2178e3285a2fefae5b0660e1a766) - Patches/Minor updates *(PR [#104](https://github.com/rlemaitre/pillars/pull/104) by [@scala-steward](https://github.com/scala-steward))*
- [`8a8c9f0`](https://github.com/rlemaitre/pillars/commit/8a8c9f0f75c3f6d6f5ebfb59ea7e02d3edb5b283) - Update skunk-circe, skunk-core from 1.0.0-M4 to 1.0.0-M5, otel4s from 0.0.4 to 0.0.5 *(PR [#105](https://github.com/rlemaitre/pillars/pull/105) by [@scala-steward](https://github.com/scala-steward))*
- [`b1a3932`](https://github.com/rlemaitre/pillars/commit/b1a393272859ed72f84f495e0c86233ab67998ee) - Update munit-scalacheck from 1.0.0-M12 to 1.0.0-RC1 *(PR [#109](https://github.com/rlemaitre/pillars/pull/109) by [@scala-steward](https://github.com/scala-steward))*
- [`17091bb`](https://github.com/rlemaitre/pillars/commit/17091bb3f0d70db12b5c315f8d1a057ad37b00f1) - Update munit-cats-effect from 2.0.0-M5 to 2.0.0 *(PR [#117](https://github.com/rlemaitre/pillars/pull/117) by [@scala-steward](https://github.com/scala-steward))*
- [`f462abd`](https://github.com/rlemaitre/pillars/commit/f462abd6573bb50317bd9d89a2afd1c760b297c6) - Update munit-scalacheck from 1.0.0-RC1 to 1.0.0 *(PR [#116](https://github.com/rlemaitre/pillars/pull/116) by [@scala-steward](https://github.com/scala-steward))*
- [`a14aad1`](https://github.com/rlemaitre/pillars/commit/a14aad1b54685a311f17ae1c6893421a6617e986) - Update munit from 1.0.0-M12 to 1.0.0 *(PR [#115](https://github.com/rlemaitre/pillars/pull/115) by [@scala-steward](https://github.com/scala-steward))*
- [`ee9245e`](https://github.com/rlemaitre/pillars/commit/ee9245e96871b61895bc30065871cc52426ca3d0) - Update skunk-circe, skunk-core from 1.0.0-M5 to 1.0.0-M6 *(PR [#113](https://github.com/rlemaitre/pillars/pull/113) by [@scala-steward](https://github.com/scala-steward))*
- [`9453aba`](https://github.com/rlemaitre/pillars/commit/9453aba6c44b8500bf20c250809db3c00370d22d) - Patches/Minor updates *(PR [#111](https://github.com/rlemaitre/pillars/pull/111) by [@scala-steward](https://github.com/scala-steward))*
- [`044571c`](https://github.com/rlemaitre/pillars/commit/044571cf2899d1c8db474fac9873d931b13e5482) - Patches/Minor updates *(PR [#118](https://github.com/rlemaitre/pillars/pull/118) by [@scala-steward](https://github.com/scala-steward))*
- [`9827be6`](https://github.com/rlemaitre/pillars/commit/9827be6c442a6d32047b6b5509cda42ac1e2668f) - Patches/Minor updates *(PR [#120](https://github.com/rlemaitre/pillars/pull/120) by [@scala-steward](https://github.com/scala-steward))*
- [`0f5f36e`](https://github.com/rlemaitre/pillars/commit/0f5f36e3c8bb4c6d700f3ceee183a20acb93a30e) - Patches/Minor updates *(PR [#122](https://github.com/rlemaitre/pillars/pull/122) by [@scala-steward](https://github.com/scala-steward))*
- [`a2b1e85`](https://github.com/rlemaitre/pillars/commit/a2b1e85ce85e7f2ffee9b0b9223d4e4a29e73651) - Upgrade otel4s to 0.8.0 and skunk to 1.0.0-M7 *(PR [#123](https://github.com/rlemaitre/pillars/pull/123) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.1.5] - 2024-03-14
### :bug: Bug Fixes
- [`0e6ca91`](https://github.com/rlemaitre/pillars/commit/0e6ca91e41507bbd46e5e549f71b1ca85d02d59b) - **core**: Handle correctly PillarsError in API *(PR [#86](https://github.com/rlemaitre/pillars/pull/86) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.1.4] - 2024-03-13
### :sparkles: New Features
- [`bb6627e`](https://github.com/rlemaitre/pillars/commit/bb6627e234a0b5fdc6c7eb5189261d0f5a85f531) - add tapir metrics *(PR [#85](https://github.com/rlemaitre/pillars/pull/85) by [@jnicoulaud-ledger](https://github.com/jnicoulaud-ledger))*

### :bug: Bug Fixes
- [`a73fb77`](https://github.com/rlemaitre/pillars/commit/a73fb77bb9990c81fe6bf55435335cd3d32d8c26) - **core**: Make Observability usable *(PR [#84](https://github.com/rlemaitre/pillars/pull/84) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.1.3] - 2024-03-13
### :sparkles: New Features
- [`a6a482f`](https://github.com/rlemaitre/pillars/commit/a6a482f17696b1e4965d69c0e7e905275d3482bd) - Add OpenAPI generation *(PR [#81](https://github.com/rlemaitre/pillars/pull/81) by [@rlemaitre](https://github.com/rlemaitre))*
- [`590b98b`](https://github.com/rlemaitre/pillars/commit/590b98b3d42687eeb743235a7a27e2cc0e5ecd52) - Add rediculous redis module *(PR [#80](https://github.com/rlemaitre/pillars/pull/80) by [@estrauser-ledger](https://github.com/estrauser-ledger))*
- [`3aa338d`](https://github.com/rlemaitre/pillars/commit/3aa338d66cc6db80ebfa0a0b14a4acff5e2e2c54) - add rabbitmq fs2 module *(PR [#79](https://github.com/rlemaitre/pillars/pull/79) by [@jnicoulaud-ledger](https://github.com/jnicoulaud-ledger))*

### :bug: Bug Fixes
- [`090983d`](https://github.com/rlemaitre/pillars/commit/090983dfc83093367a4b18a9ebb7448e973400d0) - Add doobie loader *(PR [#82](https://github.com/rlemaitre/pillars/pull/82) by [@estrauser-ledger](https://github.com/estrauser-ledger))*

### :recycle: Refactors
- [`7acb4c3`](https://github.com/rlemaitre/pillars/commit/7acb4c34a8ebc49b71dba7c7398b86c95e9116f4) - **db-migration**: Use Flyway instead of dumbo *(PR [#83](https://github.com/rlemaitre/pillars/pull/83) by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.1.1] - 2024-03-13
### :bug: Bug Fixes
- [`c0272e3`](https://github.com/rlemaitre/pillars/commit/c0272e3e8e68a48125955641e760f78e15670cdb) - remove db migration clash *(commit by [@rlemaitre](https://github.com/rlemaitre))*


## [v0.1.0] - 2024-03-13
### :sparkles: New Features
- [`12e9fbe`](https://github.com/rlemaitre/pillars/commit/12e9fbea5a902d1ac9b3e53164fdd50fa011f30a) - **flags**: [#39](https://github.com/rlemaitre/pillars/pull/39) Add ability to modify feature flags at runtime *(PR [#63](https://github.com/rlemaitre/pillars/pull/63) by [@rlemaitre](https://github.com/rlemaitre))*
- [`ac48e21`](https://github.com/rlemaitre/pillars/commit/ac48e216e447d911827a2f405d1c83ae2e20a91b) - **core**: Add circe codec for Path *(commit by [@rlemaitre](https://github.com/rlemaitre))*
- [`7084a6b`](https://github.com/rlemaitre/pillars/commit/7084a6bb9d4fa2350d27ac67b57fe9297a8406d1) - **db**: [#57](https://github.com/rlemaitre/pillars/pull/57) Add DB migration module *(PR [#72](https://github.com/rlemaitre/pillars/pull/72) by [@rlemaitre](https://github.com/rlemaitre))*
  - :arrow_lower_right: *addresses issue [#57](https://github.com/rlemaitre/pillars/issues/57) opened by [@rlemaitre](https://github.com/rlemaitre)*

### :bug: Bug Fixes
- [`ba6a282`](https://github.com/rlemaitre/pillars/commit/ba6a282db2715678a0a5cd680ead3cb53d18fb87) - **docs**: [#61](https://github.com/rlemaitre/pillars/pull/61) Reflect usage of context function in home page *(PR [#62](https://github.com/rlemaitre/pillars/pull/62) by [@rlemaitre](https://github.com/rlemaitre))*

### :recycle: Refactors
- [`2483dac`](https://github.com/rlemaitre/pillars/commit/2483dacba2ee2b1a250456c5b83052445f630cc9) - **core**: Use context functions *(PR [#59](https://github.com/rlemaitre/pillars/pull/59) by [@rlemaitre](https://github.com/rlemaitre))*
- [`2387afe`](https://github.com/rlemaitre/pillars/commit/2387afed7d06edd009dcd0808e897f4ecf7acbcb) - **core**: Remove usage of reflection for modules *(PR [#60](https://github.com/rlemaitre/pillars/pull/60) by [@rlemaitre](https://github.com/rlemaitre))*
- [`42b2f6c`](https://github.com/rlemaitre/pillars/commit/42b2f6c90481a65db09381a68b5be28aacbe264f) - **core**: [#64](https://github.com/rlemaitre/pillars/pull/64) Use fs2 Path instead of java.nio *(PR [#66](https://github.com/rlemaitre/pillars/pull/66) by [@rlemaitre](https://github.com/rlemaitre))*
  - :arrow_lower_right: *addresses issue [#64](https://github.com/rlemaitre/pillars/issues/64) opened by [@rlemaitre](https://github.com/rlemaitre)*

### :white_check_mark: Tests
- [`b53bb35`](https://github.com/rlemaitre/pillars/commit/b53bb354b761e4006543a90a174b060e351d1e1f) - **db-migration**: Add tests for DB migrations *(PR [#74](https://github.com/rlemaitre/pillars/pull/74) by [@rlemaitre](https://github.com/rlemaitre))*

### :wrench: Chores
- [`dd3fdf6`](https://github.com/rlemaitre/pillars/commit/dd3fdf6348f8a893d4f6f2e75f957c7fb7023f76) - Update scalafmt *(commit by [@rlemaitre](https://github.com/rlemaitre))*


[v0.1.0]: https://github.com/rlemaitre/pillars/compare/v0.0.2...v0.1.0
[v0.1.1]: https://github.com/rlemaitre/pillars/compare/v0.1.0...v0.1.1
[v0.1.3]: https://github.com/rlemaitre/pillars/compare/v0.1.1...v0.1.3
[v0.1.4]: https://github.com/rlemaitre/pillars/compare/v0.1.3...v0.1.4
[v0.1.5]: https://github.com/rlemaitre/pillars/compare/v0.1.4...v0.1.5
[v0.2.0]: https://github.com/rlemaitre/pillars/compare/v0.1.5...v0.2.0
[v0.2.0]: https://github.com/rlemaitre/pillars/compare/v0.1.5...v0.2.0
[v0.2.15]: https://github.com/rlemaitre/pillars/compare/v0.2.14...v0.2.15
[v0.2.16]: https://github.com/rlemaitre/pillars/compare/v0.2.15...v0.2.16
[v0.2.18]: https://github.com/rlemaitre/pillars/compare/v0.2.17...v0.2.18
[v0.2.21]: https://github.com/rlemaitre/pillars/compare/v0.2.20...v0.2.21
[v0.2.22]: https://github.com/rlemaitre/pillars/compare/v0.2.21...v0.2.22
[v0.2.23]: https://github.com/rlemaitre/pillars/compare/v0.2.22...v0.2.23
[v0.2.26]: https://github.com/rlemaitre/pillars/compare/v0.2.25...v0.2.26
[v0.2.27]: https://github.com/rlemaitre/pillars/compare/v0.2.26...v0.2.27
[v0.2.28]: https://github.com/rlemaitre/pillars/compare/v0.2.27...v0.2.28
[v0.2.30]: https://github.com/rlemaitre/pillars/compare/v0.2.29...v0.2.30
[v0.2.31]: https://github.com/rlemaitre/pillars/compare/v0.2.30...v0.2.31
[v0.2.32]: https://github.com/rlemaitre/pillars/compare/v0.2.31...v0.2.32
[v0.3.2]: https://github.com/rlemaitre/pillars/compare/v0.3.1...v0.3.2
[v0.3.3]: https://github.com/rlemaitre/pillars/compare/v0.3.2...v0.3.3
[v0.3.4]: https://github.com/rlemaitre/pillars/compare/v0.3.3...v0.3.4
[v0.3.5]: https://github.com/rlemaitre/pillars/compare/v0.3.4...v0.3.5
[v0.3.6]: https://github.com/rlemaitre/pillars/compare/v0.3.5...v0.3.6
[v0.3.7]: https://github.com/rlemaitre/pillars/compare/v0.3.6...v0.3.7
[v0.3.8]: https://github.com/rlemaitre/pillars/compare/v0.3.7...v0.3.8
[v0.3.9]: https://github.com/rlemaitre/pillars/compare/v0.3.8...v0.3.9
[v0.3.10]: https://github.com/rlemaitre/pillars/compare/v0.3.9...v0.3.10
[v0.3.11]: https://github.com/rlemaitre/pillars/compare/v0.3.10...v0.3.11
[v0.3.18]: https://github.com/rlemaitre/pillars/compare/v0.3.17...v0.3.18
[v0.3.20]: https://github.com/rlemaitre/pillars/compare/v0.3.19...v0.3.20
[v0.3.21]: https://github.com/FunktionalIO/pillars/compare/v0.3.20...v0.3.21
[v0.3.22]: https://github.com/FunktionalIO/pillars/compare/v0.3.21...v0.3.22
[v0.3.23]: https://github.com/FunktionalIO/pillars/compare/v0.3.22...v0.3.23
[v0.4.0]: https://github.com/FunktionalIO/pillars/compare/v0.3.23...v0.4.0
[v0.4.1]: https://github.com/FunktionalIO/pillars/compare/v0.4.0...v0.4.1
[v0.4.2]: https://github.com/FunktionalIO/pillars/compare/v0.4.1...v0.4.2
[v0.4.4]: https://github.com/FunktionalIO/pillars/compare/v0.4.3...v0.4.4
[v0.4.5]: https://github.com/FunktionalIO/pillars/compare/v0.4.4...v0.4.5
[v0.5.0]: https://github.com/FunktionalIO/pillars/compare/v0.4.5...v0.5.0
[v0.5.1]: https://github.com/FunktionalIO/pillars/compare/v0.5.0...v0.5.1
[v0.5.2-RC1]: https://github.com/LedgerHQ/pillars/compare/v0.5.1...v0.5.2-RC1
[v0.5.2-RC8]: https://github.com/LedgerHQ/pillars/compare/v0.5.2-RC7...v0.5.2-RC8
[v0.5.2-RC9]: https://github.com/LedgerHQ/pillars/compare/v0.5.2-RC8...v0.5.2-RC9
[v0.5.2-RC10]: https://github.com/LedgerHQ/pillars/compare/v0.5.2-RC9...v0.5.2-RC10
