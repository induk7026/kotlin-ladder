package com.example.kotlinladder.ladder.util

class StringSplitUtil {

    companion object {
        private val DEFAULT_SEPARATOR = ",|:".toRegex()

        fun split(value : String) : List<String> {
            return value.trim().split(DEFAULT_SEPARATOR)
        }
    }
}