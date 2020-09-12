enablePlugins(BuildInfoPlugin)
val playGrpcV = "0.8.2"
buildInfoKeys := Seq[BuildInfoKey]("playGrpcVersion" -> playGrpcV)
buildInfoPackage := "play.scala.grpc.sample"
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.1")
addSbtPlugin("com.lightbend.akka.grpc" %% "sbt-akka-grpc" % "0.8.4")
libraryDependencies += "com.lightbend.play" %% "play-grpc-generators" % playGrpcV
