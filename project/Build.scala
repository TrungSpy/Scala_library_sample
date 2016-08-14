package trunglibrary

import sbt._
import Keys._

object ProjectBuild extends Build {

val appDependencies = Seq(
"org.scalacheck" %% "scalacheck" % "1.9" % "test",
"org.scalatest" %% "scalatest" % "2.0.M1" % "test"
)

   lazy val root = Project(
     id ="scala-library_project",
     base = file("."),
     settings =
       Defaults.defaultSettings
       ++ Seq(PackageTask.packageDistTask)
       ++ PackageTask.distSettings
       ++ Seq(
       	  scalaVersion := "2.10.6",
	        organization := "vn.co.trunglibrary.sample",
       	  version := "1.0-SNAPSHOT",
       	  scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked"),
    	  parallelExecution := true,
    	  crossPaths := false,
       	  libraryDependencies ++= Seq(
	     "org.codehaus.plexus" % "plexus-classworlds" % "2.4",
      "org.xerial" % "sqlite-jdbc" % "3.7.2"
	      // Add other libraries here
	  )
     )
   )
}
