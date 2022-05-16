lazy val root = project
  .in(file("."))
  .settings(
    name := "flink-api-scala-3",
    description := "Template for an Apache Flink Scala 3 sbt project.",
    version := "0.1.0",
    scalaVersion := "3.1.2",
    // Provided in /lib of Flink distribution by default
    libraryDependencies += "org.apache.flink" % "flink-streaming-java" % "1.15.0" % "provided",
    libraryDependencies += "org.apache.flink" % "flink-clients" % "1.15.0" % "provided",
    libraryDependencies += "org.apache.flink" % "flink-table-planner-loader" % "1.15.0" % "provided",
    libraryDependencies += "org.apache.flink" % "flink-table-common" % "1.15.0" % "provided",
    // Note: Currently, we use the Java API in Scala because no artifacts for Scala 3 have been published yet.
    libraryDependencies += "org.apache.flink" % "flink-table-api-java" % "1.15.0" % "provided",
    libraryDependencies += "org.apache.flink" % "flink-table-api-java-bridge" % "1.15.0" % "provided",
    libraryDependencies += "org.apache.flink" % "flink-table-runtime" % "1.15.0" % "provided",
    // Additional dependencies e.g. for connectors that are NOT "provided" in /lib and thus need to be packaged
    libraryDependencies += "org.apache.flink" % "flink-connector-kafka" % "1.15.0"
  )
