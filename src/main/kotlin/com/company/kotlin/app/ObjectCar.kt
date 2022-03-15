package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Car

fun main() {

    val avanza = Car("AUTO 2000") // initializer will execute while generate Object of Class Car
    val expander = Car("MITSUBISHI", "Mitsubishi")
    val hrv = Car("HONDA", "Honda", 2021)

    println("Brand's Car is empty = ${avanza.brand.isEmpty()} and year ${avanza.year}")
    println("Brand's Car is ${expander.brand} and year ${expander.year}")
    println("Brand's Car is ${hrv.brand}, year ${hrv.year}, and group is ${hrv.group}")

}