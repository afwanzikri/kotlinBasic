package com.company.kotlin.collection

fun main() {
    val collMutableList: MutableList<String> = mutableListOf()

    collMutableList.add("collection") //index 0
//    collMutableList.add("test")
//    collMutableList.add(2, "tambah data") //tidak bisa menambahkan data, index-2 karena size data sebelumnya hanya 1
    collMutableList.add("index keberapa?") //index 1
    collMutableList.add("data ini akan ke geser index-nya") //index 3
    collMutableList.add(2, "test") //index 2
    println(collMutableList.size)
    println(collMutableList[0])
    println(collMutableList[1])
    println(collMutableList[2])
    println(collMutableList[3])

    collMutableList.remove("coll") //tidak ada data yang dihapus karena tidak ada data yg match
    collMutableList.removeAt(3) //data index-3 dihapus
    println(collMutableList.toList())

    collMutableList.addAll(mutableListOf("tambah1", "tambah2", "tambah3"))
    collMutableList.addAll(6, mutableListOf("1", "2", "3", "4"))
    println(collMutableList.toList())

    println(collMutableList[5])
    println(collMutableList[6])
    println(collMutableList[9])

//    collMutableList.removeAll(collMutableList) //menghapus isi dari object collMutableList
//    println(collMutableList.toList())

    collMutableList.retainAll(collMutableList)
    println(collMutableList.toList())

//    collMutableList.clear() //menghapus isi dari object collMutableList
//    println(collMutableList.toList())

    collMutableList.set(9, "last data")
    println(collMutableList.toList())
}
