package com.company.kotlin.kotlinoop

class Companion {
    companion object {
        val name: String = "companion object"

        fun hello(): String{
            return "This is companion object of ${name.uppercase()}"
        }

        fun hello2(value: String): String{
            return "This fun hello2 ${value.uppercase()}"
        }
    }
}