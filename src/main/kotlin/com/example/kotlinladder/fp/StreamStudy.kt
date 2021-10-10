package com.example.kotlinladder.fp

import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*
import java.util.stream.Collectors

class StreamStudy {

    companion object{
        @Throws(IOException::class)
        fun countWords(): Long {
            val contents = String(
                Files.readAllBytes(
                    Paths
                        .get("src/main/resources/fp/war-and-peace.txt")
                ), StandardCharsets.UTF_8
            )
            val words = listOf(*contents.split("[\\P{L}]+").toTypedArray())
            var count: Long = 0
            for (w in words) {
                if (w.length > 12) count++
            }
            return count
        }

        @Throws(IOException::class)
        fun printLongestWordTop100() {
            val contents = String(
                Files.readAllBytes(
                    Paths
                        .get("src/main/resources/fp/war-and-peace.txt")
                ), StandardCharsets.UTF_8
            )
            val words = listOf(*contents.split("[\\P{L}]+").toTypedArray())

            words
                .distinct()
                .filter { it.length > 12 }
                .sorted()
                .take(100)
                .forEach { word ->
                    println(word.lowercase(Locale.getDefault()))
                }
        }

        fun doubleNumbers(numbers: List<Int>): List<Int>? {
            return numbers.stream().map { x: Int -> 2 * x }.collect(Collectors.toList())
        }

        fun sumAll(numbers: List<Int>): Long {
            return numbers.stream().reduce(0) { x: Int, y: Int -> x + y }.toLong()
        }

        fun sumOverThreeAndDouble(numbers: List<Int>): Int {
            return numbers
                .filter { it > 3 }
                .sumOf { it * 2 }
        }
    }
}