package com.company.kotlin.kotlinoop

/**
 * enum Class -> class yang sudah tetap nilainya dan digunakan untuk jenis data yang sudah baku
 *
 * enum class bisa memiliki properties dan function
 * jika propertiesnya di set menggunakan constructor, maka saat pembuatan object enum wajib diisi
 * jika terdapat abstract function, wajib di override saat pembuatan object enum
 */
enum class EnumClassGender(val desc: String) {
    MALE("male"),
    FEMALE("female");

    fun printDesc(){
        println(desc)
    }
}

/**
 * bentukan umum class Enum :
 */
enum class Compass {
    BARAT, UTARA, TIMUR, SELATAN
}