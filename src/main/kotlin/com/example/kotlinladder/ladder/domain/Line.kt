package com.example.kotlinladder.ladder.domain

import kotlin.random.Random.Default.nextBoolean

class Line(
    private val numberOfPeople: Int
) {
    private val point = arrayListOf<Boolean>()

    // 사다리 게임 특성 상 마지막 라인은 무조건 false
    init {
        var flag = nextBoolean()

        for (i in 1 until numberOfPeople){
            point.add(flag)
            flag = when(flag){
                true -> false
                false -> nextBoolean()
            }
        }
        point.add(flag)
    }

    fun length(): Int {
        return point.size
    }
    fun printLine(): String {
        val builder = StringBuilder()
        builder.append("|")
        point.forEach {
            if(it){
                builder.append("-----|")
            }else{
                builder.append("     |")
            }
        }
        return builder.toString()
    }


}