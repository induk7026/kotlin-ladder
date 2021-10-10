package com.example.kotlinladder.ladder.view

import com.example.kotlinladder.ladder.domain.LadderHeight
import com.example.kotlinladder.ladder.domain.People
import java.util.*

class Input{

    companion object{
        private val scanner = Scanner(System.`in`)

        fun attendPeople(): People {
            LadderPrintString.attendNamesTitle()
            val names = scanner.nextLine()
            return People(names)
        }

        fun ladderHeight(): LadderHeight {
            LadderPrintString.radderHeightTitle()
            val ladderHeight = scanner.nextInt()
            return LadderHeight(ladderHeight)
        }
    }



}