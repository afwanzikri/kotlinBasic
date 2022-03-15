package com.company.kotlin.kotlinoop

/**
 * Create an abstract Class, abstract Properties (Attribute), and abstract function
 */
abstract class Animal {
    abstract val name: String

    abstract fun run(): Unit
}

class Cat: Animal() {
    override val name: String = "Cat"

    override fun run() {
        println("${this.name}.. run...")
    }
}

class Dog: Animal() {
    override val name: String = "Dog"

    override fun run() {
        println("${this.name}.. run...")
    }
}