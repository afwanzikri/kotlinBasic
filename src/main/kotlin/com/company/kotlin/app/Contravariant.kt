package com.company.kotlin.app

/**
 * This is about Contravariant
 */

class Contravariant<in T>{ //class Contravariant<in T>: Any() --> it works
    fun data(param: T) {
        println("param is $param")
    }

    fun data2(param: T): String {
        return "param is $param"
    }
}

fun main() {
    val constravariant = Contravariant<Any>()
    val constravariant2: Contravariant<String> = constravariant
    val constravariant3: Contravariant<Long> = constravariant

    constravariant2.data("valueData100")
    constravariant.data("valueData2000")
    constravariant2.data("valueData30")
    println("===========================================================")
    /*println(constravariant3.data2('A'))
    println(constravariant3.data2("value1"))
    println(constravariant3.data2("value3"))*/
}