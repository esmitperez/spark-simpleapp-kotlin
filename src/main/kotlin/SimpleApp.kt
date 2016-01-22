/*
 * Copyright (c) 2016.
 * Created by Esmit Perez
 * http://esmit.me
 * github.com/esmitperez
 * linkedin.com/in/esmit
 *
 */

package me.esmit.examples.kotlin.spark

import org.apache.spark.api.java.*
import org.apache.spark.SparkConf
import kotlin.text.contains


/**
 * Based on http://spark.apache.org/docs/latest/quick-start.html
 */
open class SimpleApp {
    fun load() {
        val f = "/etc/group" // any file accesible by Spark
        val conf = SparkConf().setAppName("SimpleApp")
        val sc = JavaSparkContext(conf)
        val logData = sc.textFile(f).cache()

        val numAs = logData.filter { s -> s.contains("a") }.count()
        val numBs = logData.filter { s -> s.contains("b") }.count()

        println("Lines with As: $numAs , lines with Bs: $numBs")

        sc.stop()
    }
}

fun main(args: Array<String>) {
    SimpleApp().load()
}