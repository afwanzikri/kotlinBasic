package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Note

fun main() {
    val note = Note("Catatan")
    println("title's Note is ${note.title}")
    note.title = " "
    println("title's Note is ${note.title}")
}