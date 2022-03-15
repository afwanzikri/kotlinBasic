package com.company.kotlin.kotlinoop

/**
 * Create Getter and Setter in kotlin
 */
class Note(title: String) {
    var title: String = title
//    get() = this.title //recursive call
//    get() = title //recursive call
    get() {
        println("call fun getter")
        return field
    }

    set(value) {
        println("call fun setter")
        /*
        fun .isNotEmpty() -> is still accepted whitespace
        fun .isNotBlank() -> is not accepted whitespace
         */

        field = if (value.isNotBlank()){
    //            this.title = value //recursive call
            value
        }else{
            "[value is null or blank or contains whitespace]"
        }
    }
}