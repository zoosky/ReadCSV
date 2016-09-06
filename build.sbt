lazy val root = (project in file(".")).
  settings(
    name := "ReadCSV",
    version := "1.0",
    scalaVersion := "2.11.8"
  )
  

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")


mainClass in assembly := Some("ReadCSV")

libraryDependencies += "com.github.marklister" %% "product-collections" % "1.4.3"


assemblyJarName in assembly := name.value + "-" + version.value + ".jar"
