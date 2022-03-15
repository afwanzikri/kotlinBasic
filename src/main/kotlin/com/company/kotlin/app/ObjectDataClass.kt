package com.company.kotlin.app

import com.company.kotlin.kotlinoop.DataClassProduct

fun main() {
    //data class
    val dataProduct = DataClassProduct("Rokok 12FSC", 25000, "FMCG")
    println(dataProduct)
    println(dataProduct.name)
    println(dataProduct.price)
    println(dataProduct.category)

    //copy data class
    val dataProduct2 = dataProduct.copy()
    println(dataProduct2)

    val dataProduct3 = dataProduct.copy(name = "Rokok 12GMV")
    println(dataProduct3)
}