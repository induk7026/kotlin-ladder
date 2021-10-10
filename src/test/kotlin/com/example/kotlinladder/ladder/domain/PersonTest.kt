package com.example.kotlinladder.ladder.domain

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.lang.NullPointerException

class PersonTest{


    @ParameterizedTest
    @ValueSource(strings = ["승환","테스트","Jun"])
    fun `createPersonTest`(name : String){
        val person = Person(name)
        assertThat(person.name).isEqualTo(name)
    }

    @Test
    fun nullPointExceptionTest(){
        Assertions.assertThatThrownBy {
            Person("")
        }.isInstanceOf(NullPointerException::class.java)
            .hasMessage("이름을 입력해주세요.")
    }

    @Test
    fun runTimeExceptionTest(){
        Assertions.assertThatThrownBy {
            Person("12345678901")
        }.isInstanceOf(RuntimeException::class.java)
            .hasMessage("10자 이하로 입력해주세요")
    }

}