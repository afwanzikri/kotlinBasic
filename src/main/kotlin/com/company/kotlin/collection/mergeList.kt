package com.company.kotlin.collection

fun main() {
    val list1: ArrayList<Int> = arrayListOf(1,1,2,5,8)
    val list2: ArrayList<Int> = arrayListOf(3,4,6)

    val mergeList: ArrayList<Int> = arrayListOf()
    var idx1 = 0
    var idx2 = 0

    println("size of arraylist (list1): ${list1.size}, list1: ${list1.toList()}")
    println("size of arraylist (list2): ${list2.size}, list2: ${list2.toList()}")

    while (idx1 < list1.size && idx2 < list2.size){
        if (list1[idx1] <= list2[idx2]){
            mergeList.add(list1[idx1])
            idx1++
        } else {
            mergeList.add(list2[idx2])
            idx2++
        }
    }
    println("result mergeList = ${mergeList.toList()}")
}