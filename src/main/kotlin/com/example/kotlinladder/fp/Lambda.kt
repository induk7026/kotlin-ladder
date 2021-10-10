package com.example.kotlinladder.fp

class Lambda {

    companion object{
        fun printAllOld(numbers: List<Int>) {
            println("printAllOld")
            numbers.stream().forEach(System.out::println)
        }

        fun printAllLambda(numbers: List<Int?>) {
            println("printAllLambda")
            numbers.stream().forEach(System.out::println)
        }

        fun runThread() {
            Thread { println("Hello from thread") }.start()
        }

        fun sumAll(numbers: List<Int>): Int {
            return numbers.sum()
        }

        fun sumAllEven(numbers: List<Int>): Int {
            return numbers.filter { it % 2 == 0 }.sum()
        }

        fun sumAllOverThree(numbers: List<Int>): Int {
            return numbers.filter { it > 3 }.sum()
        }
    }
}