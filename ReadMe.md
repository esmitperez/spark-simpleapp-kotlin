# Self contained Spark application example, written in Kotlin

Based on [Spark Quick Start Guide](http://spark.apache.org/docs/latest/quick-start.html)

Compile your code:
```bash
mvn clean package
```

Execute in Spark, Kotlin maven coordinates must be passed so its classes can be used:
```bash
$SPARK_HOME/bin/spark-submit \
    --class me.esmit.examples.kotlin.spark.SimpleAppKt \
    --master local[4] \
    --packages "org.jetbrains.kotlin:kotlin-stdlib:1.0.0-beta-4589" \
    target/spark-simpleapp-kotlin-1.0-SNAPSHOT.jar
```

Output (excerpt):
```bash
...
16/01/15 02:24:31 INFO DAGScheduler: ResultStage 1 (count at SimpleApp.kt:28) finished in 0.021 s
16/01/15 02:24:31 INFO DAGScheduler: Job 1 finished: count at SimpleApp.kt:28, took 0.039719 s
Lines with As: 66 , lines with Bs: 16
16/01/15 02:24:31 INFO SparkContext: Invoking stop() from shutdown hook
16/01/15 02:24:31 INFO SparkUI: Stopped Spark web UI at http://192.168.1.70:4040
16/01/15 02:24:31 INFO MapOutputTrackerMasterEndpoint: MapOutputTrackerMasterEndpoint stopped!
...
```