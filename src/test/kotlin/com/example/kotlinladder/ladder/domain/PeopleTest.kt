package com.example.kotlinladder.ladder.domain

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class PeopleTest{

    @ParameterizedTest
    @ValueSource(strings= ["1,2,3,4,5,6,7,8,9,10"])
    fun `등록_테스트`(names :String){
        val people = People(names)
        assertThat(people.people.size).isEqualTo(10)
        people.people = arrayListOf()
    }

    @ParameterizedTest
    @ValueSource(strings= ["1,2,3,4,5,6,7,8,9,10,11"])
    fun `참여_인원_초과_테스트`(names :String){
        Assertions.assertThatThrownBy{
            People(names)
        }.isInstanceOf(RuntimeException::class.java)
            .hasMessage("최대 참여 인원은 10명입니다.")
    }

    @ParameterizedTest
    @ValueSource(strings= ["1"])
    fun `참여_인원_최소_테스트`(names :String){
        Assertions.assertThatThrownBy{
            People(names)
        }.isInstanceOf(RuntimeException::class.java)
            .hasMessage("최소 참여 인원은 2명입니다.")
    }

    @ParameterizedTest
    @ValueSource(strings= ["pobi , honux ,crong ,  jk"])
    fun `출력_테스트`(names :String){
        println(People(names).toString())
    }

}