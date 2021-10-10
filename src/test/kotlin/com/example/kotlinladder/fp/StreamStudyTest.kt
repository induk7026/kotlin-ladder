package com.example.kotlinladder.fp

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.*
import java.util.function.Consumer

class StreamStudyTest {

    private var numbers: List<Int> = arrayListOf()

    @BeforeEach
    fun setup() {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6)
    }

    @Test
    @Throws(Exception::class)
    fun countWords() {
        val result = StreamStudy.countWords()
        println("result : $result")
    }

    @Test
    @Throws(Exception::class)
    fun printLongestWordTop100() {
        StreamStudy.printLongestWordTop100()
    }

    @Test
    @Throws(Exception::class)
    fun map() {
        val doubleNumbers = StreamStudy.doubleNumbers(numbers)
        doubleNumbers!!.forEach(Consumer { x: Int? -> println(x) })
    }

    @Test
    @Throws(Exception::class)
    fun sumAll() {
        val sum = StreamStudy.sumAll(numbers)
        Assertions.assertThat(sum).isEqualTo(21)
    }

    @Test
    @Throws(Exception::class)
    fun sumOverThreeAndDouble() {
        numbers = listOf(3, 1, 6, 2, 4, 8)
        val sum = StreamStudy.sumOverThreeAndDouble(numbers)
        Assertions.assertThat(sum).isEqualTo(36)
    }
}