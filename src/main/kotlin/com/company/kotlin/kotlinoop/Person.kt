package com.company.kotlin.kotlinoop

/**
 * Generate Person Class with PROPERTIES (field or attribute)
 */
class Person {
    // firstName, middleName, and lastName is properties
    var firstName: String = "" // var firstName don't allow null
    var middleName: String? = null  // var middleName could be null
    var lastName: String = ""

    fun hello(name: String) {
        println("Hello, My NickName is ${name}")
    }

    fun run(): String {
        return "Running"
    }

    fun getFullName(): String {
        return "My FullName is ${firstName} ${middleName} ${lastName}"
    }

}