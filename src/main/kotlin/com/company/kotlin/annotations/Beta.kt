package com.company.kotlin.annotations

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

/**
 * Penempatan annotation terserah sesuai contoh dibawah
 * check pengaruh penggunaan dengan DECOMPILE --> Tools > Kotlin > Show Kotlin Bytecode
 */
class ExampleTarget(
    @field:Beta val firstName: String,
    @get:Beta val middleName: String,
    @param:Beta val lastName: String
)