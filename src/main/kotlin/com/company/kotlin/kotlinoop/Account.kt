package com.company.kotlin.kotlinoop

import kotlin.properties.Delegates

class Account(desc: String) {
    val name: String by lazy {
        println("========")
        "AfwanZ"
    }

    /**
     * OBSERVABLE PROPERTIES
     * bisa menampilkan setiap perubahan data dari suatu properties
     */
    var description: String by Delegates.observable(desc){
        property, oldValue, newValue ->
        println("var ${property.name} change from $oldValue to $newValue")
    }
}