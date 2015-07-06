name := "sscheck"

version := "1.0"

scalaVersion := "2.10.5"

lazy val sparkVersion = "1.4.0"

lazy val specs2Version = "3.6.1"

// Use `sbt doc` to generate scaladoc, more on chapter 14.8 of "Scala Cookbook"

// if parallel test execution is not disabled and several test suites using
// SparkContext (even through SharedSparkContext) are running then tests fail randomly
parallelExecution := false

// Spark 
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion 

libraryDependencies += "org.apache.spark" %% "spark-streaming" % sparkVersion 

// additional libraries: NOTE as we are writing a testing library they should also be available for main
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.1"

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.12.2"

libraryDependencies += "org.specs2" %% "specs2-core" % "3.6.1" 

libraryDependencies += "org.specs2" %% "specs2-core" % specs2Version 

libraryDependencies += "org.specs2" %% "specs2-scalacheck" % specs2Version

libraryDependencies += "org.specs2" %% "specs2-matcher-extra" % specs2Version

libraryDependencies += "org.specs2" %% "specs2-junit" % specs2Version 

libraryDependencies += "io.github.nicolasstucki" %% "multisets" % "0.1"

resolvers ++= Seq(
  "MVN Repository.com" at "http://mvnrepository.com/artifact/"
)