package com.company.kotlin.kotlinoop

/**
 * couldn't create Object of an Abstract Class
 */
abstract class Location(val name: String)

/**
 * Class City Extend Class Location
 */
class City(name: String): Location(name)

/**
 * Class Country Extend Class Location
 */
class Country(name: String): Location(name)