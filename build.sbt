enablePlugins(ScalaJSPlugin)

name := "learn-scalajs"

version := "1.0"

scalaVersion := "2.12.1"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
