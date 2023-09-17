ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

libraryDependencies += "org.rogach" %% "scallop" % "5.0.0"

lazy val root = (project in file("."))
  .settings(
    name := "quadris-scala"
  )
