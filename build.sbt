name := "app"

scalaVersion := "3.2.0"

Compile / scalaSource := baseDirectory.value / "src"

Test / scalaSource := baseDirectory.value / "testImpl"

// test
libraryDependencies += "org.scalatest" %% "scalatest-wordspec" % "3.2.14" % "test"