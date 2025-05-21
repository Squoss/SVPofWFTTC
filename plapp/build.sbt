name := "SVPofWFTTC"
organization := "com.squeng"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
    .enablePlugins(PlayScala)
    .aggregate(reinraum)
    .dependsOn(reinraum)
lazy val reinraum = project

scalaVersion := "3.3.6"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test

libraryDependencies += "org.webjars.npm" % "bootstrap" % "5.3.6"
libraryDependencies += "org.webjars.npm" % "popperjs__core" % "2.11.8"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.squeng.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.squeng.binders._"
