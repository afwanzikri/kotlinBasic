package com.company.kotlin.annotations

@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.VALUE_PARAMETER,
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

/**
 * Penempatan annotation terserah sesuai contoh dibawah
 * check pengaruh penggunaan dengan DECOMPILE --> Tools > Kotlin > Show Kotlin Bytecode
 */
data class ExampleTarget(
    @field:Beta val firstName: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)