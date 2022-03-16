package com.company.kotlin.app

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data1 = TypeErasure("AfwanZ")
    val dataChild: String = data1.getData()
    println(dataChild)

    println("==================================")
    /*
        pada kondisi ini, data1 dipaksa casting dari String to Int
        sehingga ketika dieksekusi programmnya muncul error
     */
    val data2: TypeErasure<Int> = data1 as TypeErasure<Int>
    val dataChild2 = data2.getData()
    println(dataChild2)
}