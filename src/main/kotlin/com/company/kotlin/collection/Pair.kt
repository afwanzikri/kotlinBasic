package com.company.kotlin.collection

fun main() {
    val pair1: Pair<String, String> = Pair("Afwan", "Zikri")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Afwan" to "Zikri"
    println(pair2.first)
    println(pair2.second)
}