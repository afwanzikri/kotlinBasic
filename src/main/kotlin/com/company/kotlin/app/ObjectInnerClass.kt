package com.company.kotlin.app

import com.company.kotlin.kotlinoop.InnerClassBoss

fun main() {
    val boos = InnerClassBoss("Jimmi")
    println(boos.boosName)

    val afwanZ = boos.Employee("AfwanZ")
    afwanZ.hello()

    val alan = boos.Employee("Alan")
    alan.hello()

    println("====================================================")
    val emp2 = boos.Employee2("Rara")
    emp2.hello2()
}