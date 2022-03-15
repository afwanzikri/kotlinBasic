package com.company.kotlin.app

import com.company.kotlin.kotlinoop.HeadTeacher
import com.company.kotlin.kotlinoop.Teacher

fun main() {
    val teacher = Teacher("Maimunah")
    println(teacher.name)
    teacher.helloPublic()
    teacher.helloInternal()
    println("=======================================================")

    val headTeacher = HeadTeacher("Radias")
    println("He/Her Name is ${headTeacher.name} and He/Her position ${headTeacher.position}")
    headTeacher.helloHeadTeacher()
    headTeacher.helloPublic()
}