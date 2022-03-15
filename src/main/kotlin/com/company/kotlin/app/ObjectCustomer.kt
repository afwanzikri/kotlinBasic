package com.company.kotlin.app

import com.company.kotlin.kotlinoop.BusinessCustomer
import com.company.kotlin.kotlinoop.Customer
import com.company.kotlin.kotlinoop.EconomyCustomer

/**
 * SUPER CONSTRUCTOR
 */
fun main() {
    // Primary Constructor
    val customer = Customer("AfwanZ", "PrimaryConstructor", 99999, 31)
    println("This is Primary Constructor of Customer Class")
    println("Customer Name is ${customer.name}, type is ${customer.type}, Balance is ${customer.balance}, and age is ${customer.age}")
    println("=================================================================================")

    val customer1 = Customer("Rara", 10)
    println("This is Secondary Constructor of Customer Class")
    println("Customer Name is ${customer1.name}, type is ${customer1.type}, and balance is ${customer1.balance}")

    val customer2 = Customer("Alan")
    println("Customer Name is ${customer2.name}, type is ${customer2.type}, and balance is ${customer2.balance}")
    println("=================================================================================")

    val ecoCust = EconomyCustomer("Afwan", 1999999, 30)
    val ecoCust2 = EconomyCustomer("Rara", 29)
    val ecoCust3 = EconomyCustomer("Alan")
    println("=================================================================================")
    println("This is Second Object of Economy Customer")
    println("Object ecoCust, Name is ${ecoCust.name}, type is ${ecoCust.type}, balance is ${ecoCust.balance}, and age is ${ecoCust.age}")
    println("Object ecoCust2, Name is ${ecoCust2.name}, type is ${ecoCust2.type}, balance is ${ecoCust2.balance}, and age is ${ecoCust2.age}")
    println("Object ecoCust3, Name is ${ecoCust3.name}, type is ${ecoCust3.type}, balance is ${ecoCust3.balance}, and age is ${ecoCust3.age}")
    println("=================================================================================")
    println("=================================================================================")

    val bussCust = BusinessCustomer("Mr. Afwan")
    println("Object bussCust with id ${bussCust.id}, Name is ${bussCust.name}, type is ${bussCust.type}, " +
            "balance is ${bussCust.balance}, and age is ${bussCust.age}")
}