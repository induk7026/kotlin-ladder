package com.example.kotlinladder.ladder.domain

import com.example.kotlinladder.ladder.view.LadderPrintString

class Ladder(
    private val people: People,
    private val ladderHeight: LadderHeight
) {

    private val rows = arrayListOf<Line>()

    init {
        for (i in 1..ladderHeight.height){
            rows.add(Line(people.getSize()))
        }
    }

    fun printAttendNames(){
        LadderPrintString.printAttendNames(people)
    }

    fun printLadder(){
        LadderPrintString.printLadder(rows)
    }
}