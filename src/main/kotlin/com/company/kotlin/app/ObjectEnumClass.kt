package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Compass
import com.company.kotlin.kotlinoop.EnumClassGender

fun main() {
    val male = EnumClassGender.MALE
    val female = EnumClassGender.FEMALE
    val allGender: Array<EnumClassGender> = EnumClassGender.values()

    println("Enum Class Gender consist of $male, $female, and ${allGender.toList()}")
    println(male.desc)
    println(female.desc)

    println("============================================================================")
    val barat = Compass.BARAT
    val utara = Compass.UTARA
    val timur = Compass.TIMUR
    val selatan = Compass.SELATAN
    val allCompass: Array<Compass> = Compass.values()

    println("Enum Class Compass consist of $barat, $utara, $timur, $selatan, and" +
            "${allCompass.toList()}")

}