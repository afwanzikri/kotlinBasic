package com.company.kotlin.app

import com.company.kotlin.generic.GenericFunction

fun main() {
    val genFunc = GenericFunction("ConstructorClass")
    genFunc.sayHello<String>("This is param as a String") //after declare <T> in fun, then must be set param as String too
    genFunc.sayHello(true)

    val genFun2 = GenericFunction("ConsClass")
    genFun2.complexFun("AfwanZ", true, 'A', 81266005092)
}