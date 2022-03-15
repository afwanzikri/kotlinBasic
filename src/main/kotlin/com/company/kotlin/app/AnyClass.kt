package com.company.kotlin.app

/**
 *  => actually this class extend Any Class, like :
 *  class Laptop(val brand: String): Any ()
 *  class PC(val brand: String): Any ()
 */
class Laptop(val brand: String)
class PC(val brand: String)

fun main() {
    val laptop = Laptop("Macbook Pro M1 Pro 2021")
    println(laptop.brand.equals("Macbook Pro M1 Pro 2021"))
    println(laptop.hashCode())
    println(laptop.toString())
    println("=================================================================================")

    val pc = PC("ASUS")
    println(pc.brand.equals("SAMSUNG"))
    println(pc.hashCode())
    println(pc.toString())
}