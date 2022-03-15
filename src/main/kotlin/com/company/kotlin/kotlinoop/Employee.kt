package com.company.kotlin.kotlinoop

/**
 * INHERITANCE = pewarisan baik PROPERTIES maupun FUNCTIONNYA
 * In order to use Parent Class (i.e. Employee) INHERIT their properties (attribute/ field) to Child Class
 * should add *open* in first to declare Parent Class
 */
open class Employee(val name: String) {

    /**
     * OVERRIDING (MEMBUAT ULANG FUNCTION YANG SUDAH TERDAPAT PADA PARENT CLASS)
     * yang dibedakan adalah body dari function
     *
     * in order to use OVERRIDING from Parent Class, should add *open* in the first declare
     */
    open fun sayHello(name: String) {
        println("Hello ${name}, my full name is ${this.name}")
    }
}

open class Manager(name: String): Employee(name) {
    // final used to that function "sayHello" couldn't use by Child Class of Parent Class (i.e. Manager)
    final override fun sayHello(name: String) {
        super.sayHello("[this is function called by super class]")
        println("Hello $name, this function use technic overriding (Manager). -${this.name}")
    }
}

class SeniorManager(name: String): Manager(name) {
    /* This function super.sayHello from Manager Class cannot use in SeniorManager Class
     * because of declare "final" on function "sayHello"
     */

    fun sayHello2(name: String) {
        super.sayHello("super function from sayHello from Manager Class")
        println("Hello $name, this function generate with use different function name than Manager Class. ${this.name} ")
    }
}

class VicePresident(name: String): Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, this function use technic overriding (Vice President). -${this.name}")
    }
}