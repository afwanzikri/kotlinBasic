package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Student

fun main() {

    var studentA = Student()
    studentA.firstName = "Afan"
    studentA.nickNameOrNIK = 100029
    studentA.nickName = "Afwan"

    studentA.sayHello(100029)
    studentA.sayHello("Afwan")
    studentA.sayHello("Afwan", "Zikri")

}