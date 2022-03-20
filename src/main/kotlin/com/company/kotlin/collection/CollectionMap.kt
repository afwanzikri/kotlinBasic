package com.company.kotlin.collection

fun main() {
    val map1: Map<String, String> = mapOf(
        Pair("a", "data_pertama1"),
        "b" to "data_kedua2", //key "b" with value "data_kedua2" will be replace by key "b" with value "data_keenam6"
        "C" to "data_ketiga3",
        "true" to "data_keempat4",
        "c" to "data_kelima5",
        "b" to "data_keenam6"
    )

    // cara-1
    /*
    for (value in map1){
        println("key = ${value.key} and value = ${value.value}")
    }*/

    // cara-2
    for ((key, value) in map1) { //use technic destructure
        println("key = $key and value = $value")
    }

    println(map1.size)
    println(map1.keys)
    println(map1.values)
    println(map1.isEmpty())
    println(map1.containsKey("c")) //where value "data_kelima5"
    println(map1.containsValue("c")) //no value "c" found in map1
    println(map1.get("c"))
    println(map1.get("data_kelima5")) //no key "data_kelima5" found
    println(map1.getOrDefault("A", "data_kelima5"))
    println(map1.getOrDefault("b", "data_kelima5"))
}