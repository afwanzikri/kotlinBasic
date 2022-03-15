package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Person

fun main() {

    val person1 = Person()
    person1.firstName = "Alan"
    person1.middleName = "Anandito"
    person1.lastName = "Zikri"

    person1.hello("Alan")
    println("My hobby is ${person1.run()}")
    println("${person1.getFullName()}")

}