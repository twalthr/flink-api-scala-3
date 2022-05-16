# Example project for using Apache Flink with Scala 3 and SBT

This is a basic template for using Apache Flink with Scala 3 and SBT.

Note: Currently, we use the Java API in the Scala programming language because dedicated Scala 3 artifacts have not
been published yet.

For inspirations and examples of how to use the DataStream and Table API, have a look at [Flink API Examples for DataStream API and Table API](https://github.com/twalthr/flink-api-examples).
You can watch the corresponding talk [Flink's Table & DataStream API: A Perfect Symbiosis](https://youtu.be/vLLn5PxF2Lw)
on YouTube which walks through the Java version of this code.

# How to Use This Repository

1. Import this repository into your IDE (preferably IntelliJ IDEA). The project uses the Flink 1.15 version.

2. In order to make the code run within IntelliJ IDEA, it is necessary to tick
   the `Add dependencies with "provided" scope to classpath` option in the run configuration under `Modify options`.

3. All Flink programs are runnable from the IDE or SBT. You simply need to execute the `main()` method in the `Main` class.
