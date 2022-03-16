package com.company.kotlin.generic

/**
 * THIS IS GENERIC CLASS
 * bisa declare lebih dari satu type generic, as example below :
 * MyData<T>
 * MyData2<T, U>
 * MyData3<E, T, U>, etc
 */
class GenericClass<T, U>(val firstData: T, val secondData: U) {

    @JvmName("getFirstData1")
    fun getFirstData(): T = firstData //nama function tidak boleh sama dengan nama properties, sehingga muncul annotation @Jvm

    fun getSecond(): U = secondData

    fun printlnData(){
        println("FirstData is $firstData and SecondData is $secondData")
    }
}