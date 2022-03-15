package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Address

/**
 * This is example of Secondary Constructor without any Primary Constructor
 */
fun main() {

    val address1 = Address("Sumatera Barat", "Padang Pariman")
    val address2 = Address("", "", "VII Koto", "Sungai Sariak")

    println("Address1, Province is ${address1.province} and County is ${address1.county}")
    println("Address2, Province is ${address1.province}, County is ${address1.county}, " +
            "Subdistrict is ${address2.subdistrict}, and Village is ${address2.village}")

}