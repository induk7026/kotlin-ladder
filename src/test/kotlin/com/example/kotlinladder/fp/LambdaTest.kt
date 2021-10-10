package com.example.kotlinladder.fp

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.util.*

class LambdaTest{
    private var numbers: List<Int?>? = arrayListOf()

    @BeforeEach
    fun setup() {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6)
    }

    @Test
    @Throws(Exception::class)
    fun printAllOld() {
        Lambda.printAllOld(numbers as List<Int>)
    }

    @Test
    @Throws(Exception::class)
    fun printAllLambda() {
        Lambda.printAllLambda(numbers!!)
    }

    @Test
    @Throws(Exception::class)
    fun runThread() {
        Lambda.runThread()
    }

    @Test
    @Throws(Exception::class)
    fun sumAll() {
        val sum = Lambda.sumAll(numbers as List<Int>)
        Assertions.assertThat(sum).isEqualTo(21)
    }

    @Test
    @Throws(Exception::class)
    fun sumAllEven() {
        val sum = Lambda.sumAllEven(numbers as List<Int>)
        Assertions.assertThat(sum).isEqualTo(12)
    }

    @Test
    @Throws(Exception::class)
    fun sumAllOverThree() {
        val sum = Lambda.sumAllOverThree(numbers as List<Int>)
        Assertions.assertThat(sum).isEqualTo(15)
    }
}