package com.company.kotlin.kotlinoop

class InnerClassBoss(val boosName: String) {

    inner class Employee(val name: String){
        fun hello(){
            println("This is function in Employee Class (Inner Class) from Boss Class (Outter Class)" +
                    "where name in inner class is $name and boosName is ${this@InnerClassBoss.boosName}")
        }

        /**
         * Class is not allowed here
         */
        /*class Employee2 {}*/
    }

    inner class Employee2(val name: String) {
        fun hello2(){
            println("fun hello2 from Class Employee2, the outter class is ${this@InnerClassBoss.boosName}")
        }
    }
}