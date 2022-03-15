package com.company.kotlin.app

/**
 * inline class must have exactly one primary constructor parameter
 */

inline class Token(val value: String){
//    val value: String = "token" //inner class cannot have properties with backing fields
    fun toUpper(): String = value.uppercase()
}

fun main() {
    val login = Token("tokens")
    println(login.toUpper())
}