package com.company.kotlin.app

/**
 * This is about Generic Constraint
 */
open class Employee()

class Manager: Employee() //Class Manager adalah inheritance/ turunan of Class Employee

class SeniorManager: Employee() //Class SeniorManager adalah inheritance/ turunan of Class Employee

class CFO

class CEO<T: Employee>(val employee: T) //Object Class yang dibuat hanya boleh turunan dari Class Employee

fun main() {
    val data1 = CEO(Employee())
    val data2 = CEO(Manager())
    val data3 = CEO(SeniorManager())
//    val data4 = CEO("String") //constructor required : Employee
    val data5 = CFO()
}