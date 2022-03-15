package com.company.kotlin.kotlinoop

/**
 * Visibility Modifier :
 * public, private, protected, internal
 * public -> global access
 * private -> hanya bisa diakses dari scope({}) Class yang sama
 * protected -> hanya bisa diakses dari scope({}) Class yang sama + turunan Class nya
 * internal -> hanya bisa diakses dari module/ project yang sama
 */
open class Teacher(val name: String) { //could set vibility modifier in Constructor (i.e. private name: String)
    open fun helloPublic(){ //could set visibility modifier in function (i.e. private fun hello())
        println("Hello public")
    }

    private fun helloPrivate(){
        println("hello private")
    }

    protected fun helloProtected(){
        println("hello protected")
    }

    internal fun helloInternal(){
        println("hello internal")
    }
}

class HeadTeacher: Teacher{
    constructor(name: String): super(name)

    val position: String = "Head Teacher"

    fun helloHeadTeacher(){
        super.helloProtected()
        super.helloInternal()
    }

    override fun helloPublic(){
        println("hello public from Head Teacher Class")
    }
}