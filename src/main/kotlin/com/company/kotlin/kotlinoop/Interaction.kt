package com.company.kotlin.kotlinoop

interface Interaction {
    val name1: String

    fun sayHello1(name1: String) {
        println("this function is accessed from interface Interaction, ${this.name1}")
    }
}

interface Interaction2 {
    val name2: String

    fun sayHello2(name2: String) {
        println("this function is accessed from interface Interaction2, ${this.name2}")
    }
}

/**
 * (+)
 * interface class could inheritance from other interface class
 * (-)
 * interface class couldn't inherit from other class/ superclass
 * interface class couldn't inherit from abstract class
 */

interface Go : Interaction, Interaction2 {
    fun go(){
        println("fun go is accessed from interface Go!!!")
    }
}

interface MoveA {
    fun move() {
        println("interface moveA")
    }
}

interface MoveB {
    fun move() {
        println("interface moveB")
    }
}

open class Contoh

/**
 * could extend only 1 superclass
 * and with some Interface Class
 */
class Human(override val name1: String, override val name2: String): Contoh(), Go, MoveA, MoveB {
    /*
    override fun sayHello(name: String) {
    println("this function is accessed in Class Human, ${this.name}")
    }*/
    override fun move() {
        super.sayHello1("Interaction1") //no making impact when accessed it, just call val name1
        super.sayHello2("Interaction2") //no making impact when accessed it, just call val name2

        super<MoveA>.move()
        super<MoveB>.move()
        println("moveA + moveB")
    }
}
