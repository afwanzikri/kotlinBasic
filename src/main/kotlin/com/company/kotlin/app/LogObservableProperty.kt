package com.company.kotlin.app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/**
 * This is about ObservableProperty Interface
 */
class LogObservableProperty<T>(param: T): ObservableProperty<T>(param) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change ${property.name} from $oldValue to $newValue")
        return super.beforeChange(property, oldValue, newValue)
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change ${property.name} from $oldValue to $newValue")
        super.afterChange(property, oldValue, newValue)
    }
}

class Car2(brand: String, year: Int){
    var brand: String by LogObservableProperty(brand)
    var year: Int by LogObservableProperty(year)
    //check properties notNull
    var owner: String by Delegates.notNull<String>()
    //code to get before change properties -> without create class like above (LogObservableProperty)
    var description: String by Delegates.vetoable("") {property, oldValue, newValue ->
        println("Before change ${property.name}, from -> $oldValue to -> $newValue")
        true
    }
    var other: String by Delegates.observable("") {property, oldValue, newValue ->
        println("After change ${property.name}, from -> $oldValue to -> $newValue")
    }
}

fun main() {
    val car = Car2("Toyota", 2021)
    println("brand = ${car.brand} and year = ${car.year}")
    println("==========================================================")
    car.brand = "Honda"
    car.year = 2022
    println("brand = ${car.brand} and year = ${car.year}")

    car.owner = "AfwanZ"
    println("car's owner is ${car.owner}") //Property owner should be initialized before get.

    car.description = "descr"
    car.description = "description"
    println(car.description)

    car.other = "othr"
    car.other = "others"
    println(car.other)
}