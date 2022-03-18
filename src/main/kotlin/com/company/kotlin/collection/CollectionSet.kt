package com.company.kotlin.collection

import com.company.kotlin.kotlinoop.Person3

fun main() {
    val setPerson: Set<Person3> = setOf(
        Person3("set1"), Person3("set2"), Person3("set3"), Person3("lastData"),
        Person3("set1")
    )

    println(setPerson.isEmpty())
    println(setPerson.size)
    println(setPerson.contains(Person3("lastData ")))
    println(setPerson.contains(Person3("lastData")))

    for (value in setPerson){
        print("$value, ")
    }
}