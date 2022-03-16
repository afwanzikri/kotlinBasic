package com.company.kotlin.kotlinoop

/**
 * Comparable Interface
 */
class Fruit2(val name: String, val quantity: Int): Comparable<Fruit2> {
    override fun compareTo(other: Fruit2): Int {
        return quantity.compareTo(other.quantity)
    }
}