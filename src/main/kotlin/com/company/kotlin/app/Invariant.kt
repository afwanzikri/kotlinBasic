package com.company.kotlin.app

class Invariant<T>(val data: T)

fun main() {
    val invString: Invariant<String> = Invariant("String")
//    val invariant: Invariant<Any> = invString //tidak bisa seperti Polymorphism, konversi dari Child ke Parent
}