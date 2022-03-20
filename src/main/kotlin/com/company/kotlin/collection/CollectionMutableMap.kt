package com.company.kotlin.collection

fun main() {
    val mutableMap1: MutableMap<String, String> = mutableMapOf()
    /*Tidak bisa menambahkan data ke mutableMap1
    Pair("a", "data_1")
    "b" to "data_2"
    */
    mutableMap1["a"] = "data_1"
    mutableMap1.put("b", "data_2") //fun .put itu tersedia di mutableMap, jadi sebaiknya gunakan put
    mutableMap1.set("c", "data_3") //fun .set itu terdapat di mutableList

    val mutableMap2: MutableMap<String, String> = mutableMapOf()
    mutableMap2["a2"] = "data_mm2"
    mutableMap2.set("b2", "data_mm2")
    mutableMap2.put("b2", "data_edited2")

    mutableMap1.putAll(mutableMap2)

    println(mutableMap1.size)

    for ((key, value) in mutableMap1) {
        println("key = $key and value = $value")
    }

    mutableMap2.remove("a2")
    println(mutableMap1.keys)

    mutableMap1.remove("a2")
    println(mutableMap1.keys)

    mutableMap1.remove("a", "data_1") //remove contents of mutablelMap1 if "key" and "value" mathed
    for ((key, value) in mutableMap1) {
        println("key = $key and value = $value")
    }

    mutableMap2.clear()
    println(mutableMap2.keys)

//    mutableMap1.setValue(mutableMap1, mutableMap1.keys, "data_2")
}