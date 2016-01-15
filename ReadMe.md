# Self contained Spark application, written in Kotlin

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
    --packages "org.jetbrains.kotlin:kotlin-stdlib:1.0.0-beta-4584" \
    target/spark-simpleapp-kotlin-1.0-SNAPSHOT.jar
```