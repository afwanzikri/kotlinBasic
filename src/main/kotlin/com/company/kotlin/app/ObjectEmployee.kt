package com.company.kotlin.app

import com.company.kotlin.kotlinoop.Employee
import com.company.kotlin.kotlinoop.Manager
import com.company.kotlin.kotlinoop.SeniorManager
import com.company.kotlin.kotlinoop.VicePresident

fun main() {

    /**
     * an example of use INHERITANCE from EMPLOYEE CLASS
     */
    val emp = Employee("Alan Anandito Zikri")
    emp.sayHello("Alan")

    val manager = Manager("Jimmi Arfa Hamzah")
    manager.sayHello("Jimmi")

    /*
    val seniorManager = Manager("Mgr. Afwan")
    seniorManager.sayHello("mgr. Afwan")
    */
    val seniorManager = SeniorManager("Manager. Afwan Zikri")
    seniorManager.sayHello("sayHello")
    seniorManager.sayHello2("sayHello2")

    /*val vicePresident = Employee("Afwan Zikri")
        vicePresident.name = "Vice President"
     */
    val vicePresident = VicePresident("Afwan Zikri")
    vicePresident.sayHello("Afan")
}