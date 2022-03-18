package com.company.kotlin.collection

import com.company.kotlin.kotlinoop.Person3

fun main() {
    val setPerson: MutableSet<Person3> = mutableSetOf(
        Person3("set1"), Person3("set2"), Person3("set3"), Person3("lastData"),
        Person3("set1")
    )

    setPerson.add(Person3("set-n"))
    setPerson.remove(Person3("LastData")) //tidak akan menghapus data apa2, karena value dari property berbeda
    println(setPerson.toList())

    setPerson.remove(Person3("lastData"))
    println(setPerson.toList())

//    setPerson.clear()
//    println(setPerson.toList())

    for (value in setPerson){
        print("$value, ")
    }
}