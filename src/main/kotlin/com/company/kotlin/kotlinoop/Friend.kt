package com.company.kotlin.kotlinoop

class Friend(val name: String){

    fun helloFriend(friend: Friend?): String {
        return "Hello ${friend?.name}"
    }
}