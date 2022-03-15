fun main() {

    val result = calculate(3, 7)
//    val result = calculate(num2 = 7, num1 = 3)
    println(result)
}

/**
 * fun functionName(parameter): return_DataType
 */
fun calculate(num1: Int, num2:Int): String {
    val result = num1 + num2
    return result.toString()
}