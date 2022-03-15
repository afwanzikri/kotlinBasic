fun main() {

    val result = calculateDouble("Afwan", 1.4, 2.26, 4.4, 5.6, 8.7, 9.9)
    println(result)

}

fun calculateDouble(name: String, vararg values: Double): Float {
    println("$name")

    var result: Double = 0.0
//    for (i in 0..(values.size - 1)) result += values.get(i) // result = 32.26
    for (i in values) result += i // result = 32.26
    return result.toFloat()
}