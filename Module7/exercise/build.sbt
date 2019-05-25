name := "exercise"

version := "0.0.1"

scalaVersion := "2.11.12"
// additional libraries

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "2.4.1" % "provided",
"com.google.code.gson" % "gson" % "2.3.1"
)
