package com.company.kotlin.kotlinoop

class Television {
    lateinit var brand: String

    fun initTelevision(): Unit {
        brand = "iPhone"
        println("brand is ${this.brand}")
    }
}