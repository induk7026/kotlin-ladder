package com.example.kotlinladder.ladder.domain

class LadderHeight(val height: Int
) {

    init {
        validate(height)
    }

    private fun validate(height: Int) {
        if(1 > height){
            throw RuntimeException("1개 미만으로 설정 할 수 없습니다.")
        }

        if(10 < height){
            throw RuntimeException("사다리 높이는 최대 10개 입니다.")
        }
    }
}