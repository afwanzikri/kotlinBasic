package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Cat
import com.company.kotlin.kotlinoop.Dog

fun main() {
    val cat = Cat()
    println("Object Cat is ${cat.name}")
    cat.run()

    val dog = Dog()
    println("Object Dog is ${dog.name}")
    dog.run()
}