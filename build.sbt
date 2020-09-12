
name := "microservice-protobuf"

version := "0.1"

lazy val `microservice-protobuf` = (project in file("."))
  .enablePlugins(PlayScala)
  .enablePlugins(AkkaGrpcPlugin) // enables source generation for gRPC
  .enablePlugins(PlayAkkaHttp2Support) // enables serving HTTP/2 and gRPC
  .settings(
  akkaGrpcGeneratedLanguages := Seq(AkkaGrpc.Scala)
)
  .settings(
    libraryDependencies ++= CompileDeps
  )

val CompileDeps = Seq(
  //"com.lightbend.play" %% "play-grpc-runtime" % BuildInfo.playGrpcVersion,
  //"com.typesafe.akka" %% "akka-discovery" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % "10.1.11",
  //Added protobuf extra modules dep
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf",
  "com.thesamet.scalapb" %% "scalapb-json4s" % "0.10.1",
  "io.github.scalapb-json" %% "scalapb-playjson" % "0.12.0-M4",
)

val playVersion = play.core.PlayVersion.current


isSnapshot := true
scalaVersion := "2.13.1"
publishArtifact in(Compile, packageDoc) := false