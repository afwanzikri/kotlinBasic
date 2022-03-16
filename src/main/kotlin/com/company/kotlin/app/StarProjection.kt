package com.company.kotlin.app

/**
 * This is about Star Projection
 */

fun displaySize(array: Array<*>){
    println("size of array is ${array.size}")
}

fun main() {
    val charAt = arrayOf('A', 'B', 'C', 'D', 'E')
    val intEger = arrayOf(1,10,2,4,6,7,9)
    val string = arrayOf("Afwan", "Rara", "Alan")

    displaySize(charAt)
    displaySize(intEger)
    displaySize(string)
}