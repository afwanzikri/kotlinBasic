package com.company.kotlin.program

import com.company.kotlin.annotations.Fancy

@Fancy(author = "AfwanZ")
class MyApplication(val name: String, val version: Double) {

    fun info(): String = "Application : $name-$version"
}