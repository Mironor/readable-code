name := """readable-code"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.1"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "0.8.0",
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc4"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
