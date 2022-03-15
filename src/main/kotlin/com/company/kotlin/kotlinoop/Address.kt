package com.company.kotlin.kotlinoop

/**
 * CONSTRUCTOR = CLASS YANG DIBENTUK DARI PROPERTIES
 * Generate Object of Class Address with CONSTRUCTOR
 */
class Address {

    var province: String = ""
    var county: String = ""
    var subdistrict: String = ""
    var village: String = ""

    constructor(provinceParam: String, countyParam: String){
        province = provinceParam
        county = countyParam
    }

    constructor(provinceParam: String, countyParam: String, subdistrictParam: String, villageParam: String):
            this(provinceParam, countyParam) {
        subdistrict = subdistrictParam
        village = villageParam
    }

}