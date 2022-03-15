package com.company.kotlin.kotlinoop

import javax.swing.Action

interface AnonymousClass {
    fun action(): Unit
}

fun fireAction(action: AnonymousClass){
    action.action()
}