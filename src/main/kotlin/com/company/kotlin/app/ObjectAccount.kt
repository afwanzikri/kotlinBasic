package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Account

fun main() {
    val account = Account("desCRiptION")
    println(account.name)
    println(account.name)
    println(account.name)

    account.description = ">>ini description<<"
    account.description = "CHANGE1"
    account.description = "change2"
}