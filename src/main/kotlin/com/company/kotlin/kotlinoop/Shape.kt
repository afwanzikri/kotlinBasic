package com.company.kotlin.kotlinoop

/**
 * OVERRIDING FUNCTION
 *
 * OVERRIDING CLASS SHAPE
 * OVERRIDING PROPERTIES OF CORNER
 */
open class Shape {
    open val corner: Int = -1

    open fun toPrint() {
        println("println access from Class Shape")
    }
}

open class Rectangle: Shape() {
    /**
     * if add "final" in first of properties, the properties cannot override to Child Class
     */
    override val corner: Int = -3
    val parentCorner: Int = super.corner //penggunaan super keyword

    override fun toPrint() {
        println("println access from Class Rectangle")
        super.toPrint()
    }
}

class Triangle: Rectangle() {
    override val corner: Int = -5
}