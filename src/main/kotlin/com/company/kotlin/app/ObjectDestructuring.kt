package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Destructuring
import com.company.kotlin.kotlinoop.Login
import com.company.kotlin.kotlinoop.MinMax
import com.company.kotlin.kotlinoop.loginCallback

fun minMax(value1: Int, value2: Int, value3: Int): MinMax {
    return when {
        (value1 >= value2) && (value1 >= value3) && (value2 >= value3)
        -> MinMax(value3, value2, value1) //declare as MinMax(min, max) in MinMax Class
        (value1 >= value2) && (value1 >= value3) && (value3 >= value2)
        -> MinMax(value2, value3, value1)

        (value2 >= value1) && (value2 >= value3) && (value1 >= value3)
        -> MinMax(value3, value1, value2)
        (value2 >= value1) && (value2 >= value3) && (value3 >= value1)
        -> MinMax(value1, value3, value2)

        (value3 >= value1) && (value3 >= value2) && (value1 >= value2)
        -> MinMax(value2, value1, value3)
        else -> MinMax(value1, value2, value3) //declare as MinMax(min, max)  in MinMax Class
    }
}

//fun login(login: Login, callback: (Login) -> Boolean): Boolean{
fun login(login: Login, callback: loginCallback): Boolean{
    return callback(login)
}

fun main() {
    val destructuring = Destructuring(1, "AfwanZ")
    /*
    //percobaan-1
    println(destructuring.id)
    println(destructuring.name)

    println(destructuring.component1())
    println(destructuring.component2())
     */

    /*
    //percobaan-2
    val (id, name) = destructuring
    println(id)
    println(name)
     */

    //percobaan-3
    println("Destructuring Properties")
    val(a, b) = destructuring
    println("value id = $a")
    println("value name = $b")

    println("==============================================================")
    println("Destructuring Function")
    val (x, y, z) = minMax(5998, 6000, 5999)
    println("value min1 = $x")
    println("value min2 = $y")
    println("value max = $z")

    /*
    Jika tidak ingin menggunakan balikan variable, silakan gunakan "_" (underscore)
     val (x, _, z) = minMax(4100, 6000, 4000)
     println(x)
     // println(y) // variable "y" undefined
     println(z)
     */
    println("==============================================================")
    println("Destructuring Lambda")
    val login = Login("AfwanZ", "Qwerty!23")
    /*login(login){ login ->
        login.username == login.username
                && login.password == login.password
    }*/

    val feedback = login(login){ (username, password) ->
        username == login.username
                && password == "adfk" //login.password
    }
    println("is login success? $feedback")
}