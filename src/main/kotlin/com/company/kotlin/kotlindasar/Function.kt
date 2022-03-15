fun main() {

    helloWorld()
    println()
    sayHello("Afwan", "", "Zikri", "S.Kom")
    sayHello("Alan", "Anandito", "Zikri", "")
    println()
    funcDefaultParam("Afwan", "", "Zikri")
    funcDefaultParam("Rara", "Charis", "Hanjani")
    println()
    funcNamedArgument(lastName = "Zikri", // Named Argument harus ditulis semua nama per parameternya
                    middleName = "",
                    firstName = "Afwan")
}

/**
 * function dengan label "Unit" maksudnya tidak wajib mengembalikan apa-apa (tidak mengembalikan nilai)
 *
 * This function could be acces with access modifier (Public and Internal)
 * if access modifier in this fun set to Private, this fun couldn't be access from outside this Kotlin's file
 */
internal fun helloWorld(): Unit {
    println("Hello World from helloWorld function of Function.kt file")
    println("Selamat belajar kotlin")
}

fun sayHello(firstName: String, middleName: String?, lastName: String, title: String?){
    if(title != null && title != "") {
        println("My name is -> $firstName $middleName $lastName $title")
    } else {
        println("My Son's name is -> $firstName $middleName $lastName")
    }
}

/*
fun funcDefaultParam(firstName: String, middleName: String? = "", lastName: String){

}
 */

fun funcDefaultParam(firstName: String, middleName: String? = null, lastName: String){
    println("This is funcDefaultParam $firstName $middleName $lastName")
}

fun funcNamedArgument(firstName: String, middleName: String? = null, lastName: String){
    println("This is Named Argument $firstName $middleName $lastName")
}