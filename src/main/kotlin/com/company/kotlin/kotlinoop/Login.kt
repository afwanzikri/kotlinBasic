package com.company.kotlin.kotlinoop

data class Login(val username: String, val password: String)
typealias loginCallback = (Login) -> Boolean