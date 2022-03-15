package com.company.kotlin.app

import com.company.kotlin.kotlinoop.User

fun main() {

    val user1 = User("AfwanZ", "Admin!23")
//    user1.username = "AbC" //val cannot be reassigned
    val user2 = User("RaraCH", "Admin!23")
    val user3 = User("AfwanZ")

    println("User1, username is ${user1.username} and password is ${user1.password}")
    println("User2, username is ${user2.username} and password is ${user2.password}")

    // Manipulate data of user1
    println("Manipulate data of user2")
    user2.password = "Rara300592"
    println("User2, username is ${user2.username} and password is ${user2.password}")

    println("======================================================")
    /*
    * This code below is an example of use function toString() from Any Class
    * */
    println(user1) // this code will access fun toString()
    println("user3 : ${user3.casting()}")

    println("======================================================")
    /*
    * This code below is an example of use function equal() from Any Class
    * */
    println("is Object user1 == user2? -> ${user1 == user2}") //compare properties name
    println("is Object user1 == user2? -> ${user1 == user3}")
    println("is Object user1 != user2? -> ${user1 != user2}")
    println("is Object user1.equal(user3)? -> ${user1.username == user3.username}")

    println("======================================================")
    /*
    * This code below is an example of use function hashCode() from Any Class
    * */
    println(user1.hashCode())
    println(user2.hashCode())
    println(user3.hashCode())
    println("is Object user1.hashCode() == user2.hashCode()? ${user1.hashCode() == user2.hashCode()}")
    println("is Object user1.hashCode() == user2.hashCode()? ${user1.hashCode() != user2.hashCode()}")
    println("is Object user1.hashCode() == user3.hashCode()? ${user1.hashCode() == user3.hashCode()}")
    println("is Object user1.hashCode() == user1.hashCode()? ${user1.hashCode() == user1.hashCode()}")

}