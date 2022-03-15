package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Customer

fun main() {
    val customer = Customer("Alan", "Premium", 999999, 2)
    /*
    How to use let function -> return value String
     */
    customer.let {
        println(it.name)
        println(it.type)
        println(it.balance)
        println(it.age)
    }

    val properties = customer.let {
        "name ${it.name}, type ${it.type}, balance ${it.balance}, and age ${it.age}"
    }
    println(properties)

    /*
    How to use run function -> return value String
     */
    val properties2 = customer.run {
        "name ${this.name}, type ${this.type}, balance ${this.balance}, and age ${this.age}"
    }
    println(properties2)

    /*
    How to use Apply function -> return object itu sendiri
     */
    val objCustomer = customer.apply {
        "name ${this.name}, type ${this.type}, balance ${this.balance}, and age ${this.age}"
    }
    println(objCustomer)

    /*
    How to use Also function -> return object itu sendiri
     */
    val properties3 = customer.also {
        "name ${it.name}, type ${it.type}, balance ${it.balance}, and age ${it.age}"
    }
    println(properties3)

    /*
    How to use With function -> return value String
     */
    val with = with(customer) {
        "name ${this.name}, type ${this.type}, balance ${this.balance}, and age ${this.age}"
    }
    println(with)

}