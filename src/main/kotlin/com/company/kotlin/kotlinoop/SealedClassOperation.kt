package com.company.kotlin.kotlinoop

/**
 * Sealed class ini seperti Abstract Class
 */
sealed class SealedClassOperation (val name: String)

class Plus: SealedClassOperation("Plus")
class Minus: SealedClassOperation("Minus")
class Modulo: SealedClassOperation("Modulo")

fun operation(value1: Int, value2: Int, operation: SealedClassOperation): Int {
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
//        else -> {value1 % value2}
    }
}