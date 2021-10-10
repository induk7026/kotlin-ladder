package com.example.kotlinladder.ladder.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class LineTest{

    @ParameterizedTest
    @ValueSource(ints = [2,3,4,5,6])
    fun `라인_생성_테스트`(numberOfPeople : Int){
        val line = Line(numberOfPeople)
        println(line.printLine())
        assertThat(line.length()).isEqualTo(numberOfPeople)
    }
}