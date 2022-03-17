package com.company.kotlin.app

/**
 * This is about Generic Extension Function
 */
class Data<T>(val data: T)

fun Data<String>.printString(){
    val data: String = this.data
    println(data)
}

fun Data<Long>.printLong(){
    val data: Long = this.data
    println(data)
}

fun main() {
    val data = Data("AfwanZ")
    val data2 = Data(81266005092)

    data.printString()
    data2.printLong()
}