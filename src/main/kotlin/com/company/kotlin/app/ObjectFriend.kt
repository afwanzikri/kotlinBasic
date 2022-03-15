package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Friend

fun helloFriend2(friend: Friend?): String {
    //mode1
    /*return if (friend != null) {
        "1.hello friend, ${friend.name}"
    }else{
        "1.Friend is null"
    }*/

    //mode2 : safe call --> recommended
//    return "2.Hello friend, ${friend?.name}"

    //mode3: Elvis operator
    /*val named = friend?.name ?: "-"
    return "3.Hello friend, $named"*/

    //mode4: !! Operator
    val named = friend!!.name
    return "4. Hello friend, $named" //if friend is NULL, so error occured
}

fun main() {
    val friend = Friend("")
    friend.helloFriend(null)

    println(helloFriend2(null))
}