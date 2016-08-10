name := "scala-example"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= {
  val akkaStreamVersion = "1.0-RC4"
  val akkaVersion = "2.3.11"

  Seq(
    "com.typesafe.akka" %% "akka-actor"                           % akkaVersion,
    "com.typesafe.akka" %% "akka-stream-experimental"             % akkaStreamVersion,
    "com.typesafe.akka" %% "akka-http-experimental"               % akkaStreamVersion,
    "com.typesafe.akka" %% "akka-http-core-experimental"          % akkaStreamVersion,
    "com.typesafe.akka" %% "akka-http-testkit-experimental"       % akkaStreamVersion,
    "org.scalatest"     %% "scalatest"                            % "2.2.5" % "test",
    "com.typesafe.akka" %% "akka-testkit"                         % akkaVersion % "test",
    "org.specs2"        %% "specs2"                               % "2.4.2"
  )
}