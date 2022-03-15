package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Fruit

fun main() {
    val fruit1 = Fruit(3)
    val fruit2 = Fruit(2 + 2)
    val result = Fruit(2)
    val result2 = fruit1 + fruit2 //result is 2, because object result = 2 object fruit
    val result3 = fruit1.quantity + fruit2.quantity //result based on quantity dari object fruit
    println("fruit1 = $fruit1")
    println("fruit2 = $fruit2")
    println("result from fruit1 = $result")
    println("result2 is (fruit1 + fruit2) = $result2")
    println("result3 is (fruit1.quantity + fruit2.quantity) = $result3")
    println("=======================================================================")

    val fruitm1 = Fruit(3)
    val fruitm2 = Fruit(2+2)
    val resultm = fruitm1
    val resultm2 = fruitm1 - fruitm2
    val resultm3 = fruitm1.quantity - fruitm2.quantity
    println("fruitm1 = $fruitm1")
    println("fruitm2 = $fruitm2")
    println("resultm from fruitm1 = $resultm")
    println("resultm2 is (fruitm1 + fruitm2) = $resultm2")
    println("resultm3 is (fruitm1.quantity + fruitm2.quantity) = $resultm3")
}