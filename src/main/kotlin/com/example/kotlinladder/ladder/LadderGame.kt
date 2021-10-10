package com.example.kotlinladder.ladder

import com.example.kotlinladder.ladder.domain.Ladder
import com.example.kotlinladder.ladder.view.Input
import com.example.kotlinladder.ladder.view.LadderPrintString

class LadderGame {

    companion object {
        fun start(){
            val people = Input.attendPeople()
            val height = Input.ladderHeight()

            val ladder = Ladder(people = people, ladderHeight = height)
            LadderPrintString.resultTitle()
            ladder.printAttendNames()
            ladder.printLadder()
        }
    }
}