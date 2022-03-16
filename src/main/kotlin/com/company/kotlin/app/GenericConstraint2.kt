package com.company.kotlin.app

interface InterfaceClass {
    fun hello(param: String)
}

open class Employee2a()

//Class Manager adalah inheritance/ turunan of Class Employee
class Manager2a: Employee2a(), InterfaceClass {
    override fun hello(param: String) {
        println("hello, This is Manager $param")
    }

}

//Class SeniorManager adalah inheritance/ turunan of Class Employee
class SeniorManager2a: Employee2a(), InterfaceClass {
    override fun hello(param: String) {
        println("hello, This is Senior Manager $param")
    }
}

//Object Class yang dibuat hanya boleh turunan dari Class Employee
class CEO2a<T>(val employee: T) where T: Employee2a, T: InterfaceClass

fun main() {
//    val data1 = CEO2a(Employee2a())//
    val data2 = CEO2a(Manager2a()) //tidak error karena class Manager2a implement Class Employee dan InterfaceClass
    val data3 = CEO2a(SeniorManager2a()) //tidak error karena class SeniorManager2a implement Class Employee dan InterfaceClass
//    val data4 = CEO("String") //constructor required : Employee
}