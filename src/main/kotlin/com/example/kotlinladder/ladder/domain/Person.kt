package com.example.kotlinladder.ladder.domain

import org.apache.logging.log4j.util.Strings
import java.lang.NullPointerException
import java.lang.RuntimeException

class Person (
    val name : String
) {
    init {
        if(Strings.isBlank(name)){
            throw NullPointerException("이름을 입력해주세요.")
        }

        if(name.length > 10){
            throw RuntimeException("10자 이하로 입력해주세요")
        }
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun toString(): String {
        return name
    }


}