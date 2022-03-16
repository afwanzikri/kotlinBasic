package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Fruit2

fun main() {
    val fruit1 = Fruit2("Banana", 4)
    val fruit2 = Fruit2("Banana", 10)
    val fruit3 = Fruit2("DragonFruit", 11)

    println(fruit1 < fruit2)
    println(fruit1 <= fruit2)
    println(fruit1 > fruit2)
    println(fruit1 >= fruit2)
    println("=========================================")
    println(fruit2 < fruit3) //no problem when name of fruit is different
    println(fruit2 <= fruit3)
    println(fruit2 > fruit3)
    println(fruit2 >= fruit3)
}