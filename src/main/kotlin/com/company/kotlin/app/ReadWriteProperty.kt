package com.company.kotlin.app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * This is about Read Write Property
 */
class LogReadWriteProperty(var data: String): ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get property of ${property.name} with value $data")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set property of ${property.name}, from $data to $value")
        data = value
    }
}

class Person3(param: String){
    var name: String by LogReadWriteProperty(param)
}

fun main() {
    val person3a = Person3("AfwanZ")
    println(person3a.name)
    person3a.name = "Afwan Zikri"
    println(person3a.name)
}