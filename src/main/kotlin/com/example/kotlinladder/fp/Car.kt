package com.example.kotlinladder.fp

import java.util.*

class Car(

) {

    private var name : String = ""
    private var position : Int = 0

    constructor(name: String, position: Int) : this() {
        this.name = name
        this.position = position
    }

    fun move(moveStrategy: MoveStrategy): Car {
        return if (moveStrategy.isMovable) {
            Car(name, position + 1)
        } else this
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val car = o as Car
        return position == car.position &&
                name == car.name
    }

    override fun hashCode(): Int {
        return Objects.hash(name, position)
    }


}