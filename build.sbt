name := """pacemakerplay"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "webjars"    at "http://webjars.github.com/m2"
)

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  evolutions,
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "net.sf.flexjson" % "flexjson" % "3.3",
   "org.webjars"               %% "webjars-play"       % "2.3.0",
  "org.webjars"               % "bootstrap"           % "3.0.0" exclude("org.webjars", "jquery"),
  "org.webjars"               % "jquery"              % "1.8.3",
  "org.mockito" % "mockito-core" % "1.10.19"
  )

fork in run := false
jacoco.settings


