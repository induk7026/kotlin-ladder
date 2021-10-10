package com.example.kotlinladder.fp

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest{

    @Test
    fun `이동`(){
        val car = Car("pobi", 0)
        val actual = car.move(object : MoveStrategy {
            override val isMovable: Boolean
                get() = true
        })
        assertThat(actual).isEqualTo(Car("pobi", 1))
    }

}