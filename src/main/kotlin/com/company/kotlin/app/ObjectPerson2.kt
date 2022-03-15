package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Person2

fun main() {

    val afwan = Person2("Afwan", "", "Zikri")
    val rara = Person2("Rara", "Charis", "Hanjani")
    val alan = Person2("Alan", "Anandito", "Zikri")

    println(afwan.firstName)
    println(rara.middleName)
    println(alan.lastName)

    /*println(afwan.firstNameParam)
    println(rara.middleNameParam)
    println(alan.lastNameParam)*/

}