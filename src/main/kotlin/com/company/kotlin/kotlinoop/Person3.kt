package com.company.kotlin.kotlinoop

class Person3(val name: String) {
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean = when(other) {
        is Person3 -> name == other.name //other is object that have property "name"
        else -> false
    }

    override fun toString(): String {
        return "${this.name}"
    }
}