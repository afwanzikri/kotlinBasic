package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Human

fun main() {
    val human = Human("AfwanZ", "Zikri")
    println(human.name1)
    println(human.name2)

    println("hashCode of human.name is = ${human.name1.hashCode()}")
    println("hashCode of human.name is = ${human.name2.hashCode()}")

    human.sayHello1("Af1")
    human.sayHello2("Zkr")
    human.go()

    human.move()
}