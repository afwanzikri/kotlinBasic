package com.company.kotlin.app

import com.company.kotlin.generic.GenericClass

/**
 * example of GENERIC CLASS (MyData)
 */
fun main() {
    val myData: GenericClass<String, Int> = GenericClass("AfwanZ", 30) //declare constructor harus sesuai dengan declare Generic Type<String, Int>
    println("${myData.firstData}, ${myData.secondData}")
    println("${myData.getFirstData()}, ${myData.getSecond()}")
    myData.printlnData()

    println("======================================================================")
    val myData2 = GenericClass(true, 'A') //bentuk declare lain dari contoh diatas
    println("${myData2.firstData}, ${myData2.secondData}")
    println("${myData2.getFirstData()}, ${myData2.getSecond()}")
    myData2.printlnData()
}