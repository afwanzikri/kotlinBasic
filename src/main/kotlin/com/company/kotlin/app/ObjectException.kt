package com.company.kotlin.app

import com.company.kotlin.exception.ValidationException

fun validationException(param: String) {
    if (param.isBlank()){
        throw ValidationException("param is null")
    }else {
        println("param is not null, param = $param")
    }
}

fun main() {
    //mode1: catch error
    /*println(validationException("hey"))
    println(validationException(""))*/

    try {
        println(validationException("hey"))
        println(validationException(""))
    } catch (error: ValidationException){
        println("Error with message --> ${error.message}")
    } catch (error: NullPointerException){
        println("NullPointerException --> ${error.message}")
    } finally { //akan selalu dieksekusi jika try-catch sukses atau gagal/ error
        println("finally block will always be execute")
    }
}