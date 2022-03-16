package com.company.kotlin.generic

/**
 * This is GENERIC FUNCTION
 */
class GenericFunction(val name: String) {

    /*
        If declare GenericFunction<T> above, then fun <T> is override from GenericFunction<T>
        so, be carefull of used Generic Type
     */
    fun <T> sayHello(param: T){ //set diamond operator after declare fun, stand for function
        println("Generic Function, where param is [$param] and name is [$name]")
    }

    fun <T, U, V, W> complexFun(param1: T, param2: U, param3: V, param4: W){
        println("param1 is $param1, param2 is $param2, " +
                "param3 is $param3, param4 is $param4")
    }
}