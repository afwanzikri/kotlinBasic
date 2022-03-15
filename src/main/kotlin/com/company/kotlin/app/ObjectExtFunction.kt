package com.company.kotlin.app

import com.company.kotlin.kotlinoop.*

fun main() {
    val extFunction = ExtensionFunction("Afwan", 30)
    extFunction.hello("Az")
    println(extFunction.nullable())
    println(extFunction.fullname)

    val extFunc: ExtensionFunction? = null
    println(extFunc.nullable())
}