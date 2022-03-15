package com.company.kotlin.kotlinoop

/**
 * Create Class with PRIMARY CONSTRUCTOR, i.e. CUSTOMER(Primary_Constructor)
 */
open class Customer(
    open val name: String,
    val type: String,
    val balance: Long,
    val age: Int) {

    constructor(name: String, age: Int): this(name, "type:null", 9999999, age)
    constructor(name: String): this(name, 2)
}

/**
 * If [Child Class] extend [Parent Class] with PRIMARY CONSTRUCTOR,
 * then Child Class need declare CONSTRUCTOR from Parent Class with min. 1 CONSTRUCTOR
 */
class EconomyCustomer: Customer {
    constructor(name: String, balance: Long, age: Int): super(name, "Economy", balance, age)
    constructor(name: String, age: Int): super(name, age)
    constructor(name: String): super(name)
}

class BusinessCustomer (override val name: String): Customer(name, "BusinessCust", 9888888889, 55) {
//    constructor(id: Int, name: String, isMarried: Char) : this(id = 9, name = "AfZ", isMarried = 'Y')
    val id: Int = 9
}
