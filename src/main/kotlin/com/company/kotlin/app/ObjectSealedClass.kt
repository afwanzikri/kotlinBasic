package com.company.kotlin.app

import com.company.kotlin.kotlinoop.*

/*fun operation(value1: Int, value2: Int, operation: SealedClassOperation): Int {
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
//        else -> {value1 % value2}
    }
}*/

fun main() {
    println(operation(10,5, Plus()))
    println(operation(10,5, Minus()))
    println(operation(10,5, Modulo()))
}