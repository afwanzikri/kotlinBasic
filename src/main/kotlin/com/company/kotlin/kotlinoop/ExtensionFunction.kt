package com.company.kotlin.kotlinoop

import java.util.*

/**
 * Extention Class couldn't call visibility modifier (private/ protected)
 */
class ExtensionFunction(val name: String, val age: Int)

//Extension properties
val ExtensionFunction.fullname: String
    get() = this.name.uppercase(Locale.getDefault())

//Extention Funtion
fun ExtensionFunction.hello(name: String){
    println("hello $name, my name is ${this.name} and my age is ${this.age}")
}

//Extention Funtion
fun ExtensionFunction?.nullable(): String {
    return when (this){
        null -> "object is null"
        else -> "object is not null"
    }
}

