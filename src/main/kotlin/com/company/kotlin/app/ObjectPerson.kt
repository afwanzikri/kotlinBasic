package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Person

fun main() {

    val afwan = Person()
    afwan.firstName = "Afwan"

    val rara = Person()
    rara.firstName = "Rara"

    val alan = Person()
    alan.firstName = "Alan"

    println("Object of afwan'firstname is ${afwan.firstName}")
    println(rara.firstName)
    println(alan.firstName)

}