package com.company.kotlin.kotlinoop

/**
 * OVERLOADING = CREATE SAME FUNCTION NAME WITH DIFFERENT PARAMETER
 *
 * This class will give you an example of used an OVERLOADING function
 * Overload function will work if the (same Name of Function and different type of Parameter)
 * OR (Same Name of function and Different num of Parameter)
 */
class Student {

    var nickName: String = ""
    var nickNameOrNIK: Int = 0
    var firstName: String = ""
    var lastName: String = ""

    fun sayHello(nickNameParam: String): Unit {
        println("Hello everyone, you can call me ${nickNameParam}")
    }

    fun sayHello(nickNameOrNIKParam: Int): Unit {
        println("Hello everyone, my NIK is ${nickNameOrNIKParam}")
    }

    fun sayHello(firstName: String, lastName: String): Unit {
        println("My full name is ${firstName} ${lastName}, My FirstName is ${this.firstName}")
    }

}