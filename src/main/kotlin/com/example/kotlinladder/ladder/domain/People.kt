package com.example.kotlinladder.ladder.domain

import com.example.kotlinladder.ladder.util.StringSplitUtil
import kotlin.streams.toList

class People(
    private val names : String
) {
    var people : List<Person> = arrayListOf()

    init {
        val nameList = StringSplitUtil.split(names)
        people = nameList.stream().map {
            Person(it)
        }.toList()
        validate()
    }

    private fun validate(){
        if(people.size > 10){
            throw RuntimeException("최대 참여 인원은 10명입니다.")
        }

        if(people.size < 2){
            throw RuntimeException("최소 참여 인원은 2명입니다.")
        }

        if(people.distinct().size != people.size){
            throw RuntimeException("중복된 이름이 있습니다.")
        }
    }

    fun getSize(): Int {
        return people.size
    }

    override fun toString(): String {
        return people.joinToString("      ")
    }

}