fun hello(value: String, transformer: (String) -> String ): String {
    val nameTransformer = transformer(value)
    return "Hello, $nameTransformer"
}

val anonymousUpper = fun(param1: String): String {
    return if(param1.isBlank()) "nothing"
    else param1.uppercase()
}

fun main() {

    println(hello("This is feature uppercase", anonymousUpper))
    println(hello("", anonymousUpper))

    println(hello("COnvERT to lOWEr caSE", fun(param1: String): String {
        return param1.lowercase()
    }))

}