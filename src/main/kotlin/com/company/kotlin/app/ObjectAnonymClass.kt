package com.company.kotlin.app

import com.company.kotlin.kotlinoop.AnonymousClass
import com.company.kotlin.kotlinoop.fireAction

fun main() {
    fireAction(object: AnonymousClass {
        override fun action() = println("Action One")
    })

    fireAction(object: AnonymousClass {
        override fun action() = println("Action Two")
    })

}