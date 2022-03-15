package com.company.kotlin.app

import com.company.kotlin.annotations.NotBlank
import com.company.kotlin.exception.ValidationException
import com.company.kotlin.kotlinoop.CategoryRequest
import com.company.kotlin.kotlinoop.ProductRequest
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

/*
fun validateProdRequest(request: ProductRequest){
    if (request.id.isBlank()){
        throw ValidationException("id is blank")
    }else if (request.name.isBlank()){
        throw ValidationException("name id blank")
    }
}*/

fun validateProdRequest(request: Any){
    val clazz = request::class
    val properties = clazz.memberProperties

    // Iterate one by one and check if annotation @NotBlank is exist
    for (property in properties){
        if (property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
            when(value){
                is String -> {
                    if (value.isBlank()) {
                        throw ValidationException("${property.name} is blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = ProductRequest("a1", "12FSC", 25000)
    validateProdRequest(request)

    val request2 = CategoryRequest("a2", "GGSP Ayong")
    validateProdRequest(request2)

}