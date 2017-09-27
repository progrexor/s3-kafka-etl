name := "s3-kafka-etl"

lazy val projectScalaVersion = "2.12.3"
lazy val projectVersion = "0.1-SNAPSHOT"

version := projectVersion
scalaVersion := projectScalaVersion

lazy val S3toKafka = (project in file("."))
  .aggregate(S3toMessage, kafkaStreams)

lazy val S3toMessage = (project in file("s3-to-message"))
  .settings(
    scalaVersion := projectScalaVersion,
    name := "s3-to-message",
    version := projectVersion,
    libraryDependencies ++= Seq(
    )
  )

lazy val kafkaStreams = (project in file("kafka-streams"))
  .settings(
    scalaVersion := projectScalaVersion,
    name := "kafka-streams",
    version := projectVersion,
    libraryDependencies ++= Seq(
    )
  )
