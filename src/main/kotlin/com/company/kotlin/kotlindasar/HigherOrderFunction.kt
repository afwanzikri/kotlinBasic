fun main() {

    /**
     * Lambda Expression place in last parameter of function
     */
    fun hello(value: String, transformer: (String) -> String ): String {
        val nameTransformer = transformer(value)
        return "Hello, $nameTransformer"
    }
    val lambdaUpper1 = { value: String -> value.uppercase() }
    println(hello("This is Optimus Prime-1", lambdaUpper1))

    println(hello("This is Optimus Prime-2", { value: String -> value.uppercase() }))

    /**
     * Trailing Lambda
     */
    println(
        hello("This is Optimus Prime-3")
        { value: String -> value.lowercase() })

}