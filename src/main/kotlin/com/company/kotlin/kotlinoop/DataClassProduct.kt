package com.company.kotlin.kotlinoop

/**
 * will execute method in Primary Constructor like :
 * toString(), hashCode(), equal()
 */
data class DataClassProduct(
    val name: String,
    val price: Int,
    val category: String
)