fun main() {

    fun returnIf(name: String?): String {
        return if(name == "" || name == null) "return from block if"
        else "return from block else (if) $name"
    }

    fun returnWhen(name: String?): String {
        return when (name){
            "", null -> "return from block when"
            else -> "return from block else (when) $name"
        }
    }

    println(returnIf("afwan"))
    println(returnWhen(""))

}