ThisBuild / scalaVersion := "3.3.0"

name := "Java2Scala"
organization := "ch.epfl.scala"
version := "0.1"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.2.0",
  "org.eclipse.jdt" % "org.eclipse.jdt.core" % "3.33.0"
)
