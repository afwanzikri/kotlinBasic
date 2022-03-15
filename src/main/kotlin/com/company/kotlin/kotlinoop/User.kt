package com.company.kotlin.kotlinoop

/**
 * PROPERTIES in CONSTRUCTOR
 */
class User(val username: String, var password: String) {
    constructor(username: String): this(username, "")

    fun casting(): String {
        return when (this.password) {
            null, "" -> "password belum diset"
            else -> "******"
        }

    }

    override fun toString(): String {
        return "Object User with ${this.username} and ${this.password}"
    }

    override fun equals(other: Any?): Boolean {
        return when(other){
            is User -> other.username == this.username
            else -> false
        }
    }

    override fun hashCode(): Int {
        return username.hashCode()
    }
}