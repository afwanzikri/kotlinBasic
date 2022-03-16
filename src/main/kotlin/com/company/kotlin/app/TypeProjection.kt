package com.company.kotlin.app

class Container<T>(var data: T) //invariant

fun copyContainer(from: Container<out Any>, to: Container<in Any>) { //funcopyContainer(Constravariant, Covariant)
    println("to.data ${to.data} and from.data ${from.data}")
    to.data = from.data
}

fun main() {
    val dataContainer1 = Container(81266005092)
    val dataContainer2: Container<Any> = Container("String")

    copyContainer(dataContainer1, dataContainer2)

    //copy value from container1 to container2
    println(dataContainer1.data)
    println(dataContainer2.data)
}