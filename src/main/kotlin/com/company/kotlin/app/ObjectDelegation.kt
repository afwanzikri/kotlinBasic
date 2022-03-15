package com.company.kotlin.app

import com.company.kotlin.kotlinoop.MyBase
import com.company.kotlin.kotlinoop.MyBaseDelegate

fun main() {
    val base = MyBase()
    base.sayHello("abc")

    val myBase = MyBaseDelegate(base)
    myBase.base.sayHello("cba")
    myBase.sayHello("zxc")
    myBase.goodBye("AfwanZ")
}