package com.company.kotlin.kotlinoop

/**
 * This is Singleton Object
 */
object Utilities {
    const val name: String = "Utilities"

    fun toUpper(value: String): String{
        return value.uppercase()
    }
}