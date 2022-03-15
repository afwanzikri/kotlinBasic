package com.company.kotlin.app

import java.util.TimeZone

fun printAny(any: Any){
    /**
     * recommend : most people use WHEN to check a DATATYPE
     */
    when (any) {
        is Laptop -> println("any is Laptop and Laptop's Brand is ${any.brand}")
        is PC -> println("any is PC and PC's brand is ${any.brand}")
        else -> println(any)
    }
}

fun unSafeCase(any: Any){
    val value = any as String
    println(value)
}

fun safeCase(any: Any){
    val value: String? = any as? String
    println(any)
}

fun main() {
    printAny("String")
    printAny(1)

    val laptop = Laptop ("Macbook Pro M1 Pro")
    printAny(laptop.brand)

    printAny(PC("SAMSUNG"))

    unSafeCase("function unSafeCase -> Any")
//    unSafeCase(1)

    safeCase("function safeCase -> String")
    safeCase('Y')
    safeCase(1)
}