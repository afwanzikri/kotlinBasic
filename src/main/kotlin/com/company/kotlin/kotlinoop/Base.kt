package com.company.kotlin.kotlinoop

interface Base {
    fun sayHello(name: String)
    fun goodBye(name: String)
}

class MyBase: Base {
    override fun sayHello(name: String) {
        println("hello world, $name")
    }

    override fun goodBye(name: String) {
        println("good bye, $name")
    }
}

/**
 * this below is an example of use MANUAL DELEGATION
 */
/*class MyBaseDelegate(val base: Base): Base {
    override fun sayHello(name: String) {
        base.sayHello("hay, $name")
    }

    override fun goodBye(name: String) {
        base.goodBye(name)
    }
}
 */

/**
 * This is how to create best practice DELEGATION
 */
class MyBaseDelegate(val base: Base): Base by base