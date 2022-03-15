fun main() {

    hello("Afwan")
    val result = calculateDouble(10.1, 8.9)
    println(result)
}

fun hello(welcome: String): Unit = println("Welcome $welcome")

//fun calculateDouble(num1: Double, num2: Double): Float = (num1 - num2).toFloat()
fun calculateDouble(num1: Double, num2: Double): Float = (num1 - num2).toFloat()