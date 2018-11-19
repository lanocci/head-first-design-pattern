lazy val duck = (project in file("duck"))
  .settings(
    name := "duck",
    version := "1.0",
    scalaVersion := "2.12.7",
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.0.5",
      "org.scalatest" %% "scalatest" % "3.0.5" % "test"
    )
  )
