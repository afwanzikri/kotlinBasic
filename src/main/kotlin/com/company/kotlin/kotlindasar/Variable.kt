const val APP = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main(){
    println("Welcom to $APP and version $VERSION")

    /*
    val fullName   = "Afwan Zikri" // val = immutable (tidak dapat diubah)
    var age: Int    = 30 // var = mutable (dapat berubah valuenya)

//    fullName = "Zikri" // val cannot be reassigned

    println(fullName)
    println(age)
    */

    // Handle value Nullable
//    var firstName: String? = "Afwan"
    var firstName: String? = "" // get length RESULT = 0 --> NOL
//    var firstName: String? = null // get length RESULT = null
    println(firstName)
//    println(firstName?.first()) // Get CHAR pertama dari String dimana String tidak boleh NULL
    println(firstName?.length)

}