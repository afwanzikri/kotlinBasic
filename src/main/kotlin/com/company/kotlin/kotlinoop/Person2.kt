package com.company.kotlin.kotlinoop

/**
 * This class Person2 is Class use CONSTRUCTOR
 * CONSTRUCTOR is Parameter needed when Generate an Object from a Class
 */
class Person2 (
    firstNameParam: String,
    private val middleNameParam: String?,
    private val lastNameParam: String) {

    var firstName = firstNameParam
    var middleName = middleNameParam
    var lastName = lastNameParam
}