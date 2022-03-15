package com.company.kotlin.annotations

/**
 * Annotation Class hanya bisa mempunyai Primary Constructor
 * > Tidak bisa mempunyai Secondary Constructor
 * > Tidak bisa mempunyai properties
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Fancy(val author: String)
