package com.company.kotlin.collection

fun main() {
    val list1: List<String> = listOf("list1", "list2", "123", "'A'", "true")

    println(list1.size) //check banyak isi data list
    println(list1.isEmpty()) //check object list NULL apa tidak
    println(list1.isNotEmpty())
    println(list1.isNullOrEmpty())
    println(list1.contains("Alan", ))
    println(list1.contains("'A' ", ))
    println(list1.contains("'A'", ))

    for (list in list1){
//        println(list.iterator().nextChar())
//        println(list.iterator().next())
//        println(list.iterator().hasNext())

    }

    println(list1.containsAll(listOf("list1", "'A'", "true")))
    println(list1.get(3))
    println(list1[1])
    println(list1.indexOf("list1"))
    println(list1.indexOf("0"))
    println(list1.lastIndexOf("'A'"))
}