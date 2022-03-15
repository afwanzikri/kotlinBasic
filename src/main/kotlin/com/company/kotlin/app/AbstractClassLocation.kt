package com.company.kotlin.app

import com.company.kotlin.kotlinoop.City
import com.company.kotlin.kotlinoop.Country
//import com.company.kotlin.kotlinoop.Location

fun main() {
    // cannot create an instance of an abstract class
//    val location = Location("Central Jakarta")

    val city = City("Central Jakarta")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}