package com.company.kotlin.annotations

@Target(AnnotationTarget.PROPERTY) //id, name
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class NotBlank()
