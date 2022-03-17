package com.company.kotlin.app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogReadOnlyProperty(val data: String): ReadOnlyProperty<Any, String>{
    var counter = 0
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        counter++
        println("Access property ${property.name} with value of data = $data")
        return "${data.uppercase()}_$counter"
    }
}

class NameWithLog(param: String){
    val name: String by LogReadOnlyProperty(param)
}

fun main() {
    val nameWithLog = NameWithLog("AfwanZ")

    println(nameWithLog.name)
    println(nameWithLog.name)
}