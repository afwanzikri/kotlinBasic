fun main() {

    val name: String = "afwanzikri@gmail.com" test "UP"
    println(name)

}

infix fun String.test(typeData : String): String {
    if (typeData == "UP") return this.uppercase() 
    else return this.lowercase()
}