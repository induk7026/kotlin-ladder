package com.example.kotlinladder.ladder.view

import com.example.kotlinladder.ladder.domain.Line
import com.example.kotlinladder.ladder.domain.People
import java.util.ArrayList

class LadderPrintString {

    companion object{
        fun attendNamesTitle(){
            println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)")
        }

        fun radderHeightTitle(){
            println("최대 사다리 높이는 몇 개인가요?")
        }

        fun resultTitle(){
            println("실행결과\n")

        }

        fun printAttendNames(people: People){
            println(people.toString())
        }

        fun printLadder(rows: ArrayList<Line>) {
            for (line in rows){
                println(line.printLine())
            }
        }
    }
}