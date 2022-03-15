package com.company.kotlin.kotlinoop

class Application(val value: String) {
    object Utilities{
        fun hello(name: String): String{
            return "this is utilities of ${name.uppercase()}"
        }
    }
}