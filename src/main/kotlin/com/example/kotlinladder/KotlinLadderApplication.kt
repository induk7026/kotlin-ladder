package com.example.kotlinladder

import com.example.kotlinladder.ladder.LadderGame
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinLadderApplication

fun main(args: Array<String>) {
    runApplication<KotlinLadderApplication>(*args)
    LadderGame.start()
}
