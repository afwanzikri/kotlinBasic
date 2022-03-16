package com.company.kotlin.app

/**
 * This is about Covariant
 */

class Covariant<out T>(val data: T){ //sign "out" as COVARIANT
    fun data(): T{ //tidak bisa diset input param di fun data(param) X
        return data
    }
}

fun main() {
    val data1: Covariant<String> = Covariant("Covariant")
    val data2: Covariant<Any> = data1

    println(data1)
    println(data1.data)
    println(data1.data())
    println("=========================================================")
    println(data2) //clone data1
    println(data2.data)
    println(data2.data())
}