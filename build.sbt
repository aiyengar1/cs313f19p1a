name := "hello-java"

version := "0.1"

javacOptions in compile += "-Xlint:all"

javaOptions += "-enableassertions"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "org.apache.commons" % "commons-collections4" % "4.4"
)

enablePlugins(JavaAppPackaging)
