package com.company.kotlin.kotlinoop

/**
 * There is PRIMARY CONSTRUCTOR of Car, i.e. Car(Primary_Constructor)
 * Constructor below is called as Secondary Constructor, i.e. Constructor()
 *
 * Best Practice is use PRIMARY CONSTRUCTOR
 */
class Car (groupParam: String,
            brandParam: String,
            yearParam: Int) {

    var group: String = groupParam
    var brand: String = brandParam
    var year: Int = yearParam

    // Initializer Block
    init {
        println("Create Object of Car $groupParam")
    }

    // SECONDARY CONSTRUCTOR
    // this() code below referred to Primary Constructor
    constructor(groupParam: String, brandParam: String): this(groupParam, brandParam, 2022) {
        println("This is Secondary Constructor-1")
    }

    // this() code below referred to Secondary Constructor above
    constructor(groupParam: String): this(groupParam, "") {
        println("This is Secondary Constructor-2")
    }
}