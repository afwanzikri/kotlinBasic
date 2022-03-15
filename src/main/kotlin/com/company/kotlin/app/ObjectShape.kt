package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Rectangle
import com.company.kotlin.kotlinoop.Shape
import com.company.kotlin.kotlinoop.Triangle

fun main() {
    val shape = Shape()
    println("${shape.corner}")
    println("==========================================================")

    val shape2 = Rectangle()
    println("${shape2.corner}")
    println("${shape2.parentCorner}")
    shape2.toPrint()
    println("==========================================================")

    val shape3 = Triangle()
    println("${shape3.corner}")
}