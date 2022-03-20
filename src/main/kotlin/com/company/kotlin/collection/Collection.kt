package com.company.kotlin.collection

fun <T> displayCollection(collection: Collection<T>) {
    for (element in collection) println(element)
}

fun main() {
    displayCollection(listOf("AfwanZ"))
    displayCollection(listOf("AfwanZ", "RaraCH", "AlanAZ"))
    displayCollection(setOf("data1", "data2", "data3", 'Z'))
    displayCollection(mapOf("a" to "data1").entries)
    displayCollection(mapOf(Pair("b", "data2")).entries)
//    displayCollection(mapOf("a" to "data1")) //error, karena mapOf bukan turunan dari Collection
}