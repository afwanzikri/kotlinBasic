fun main() {

    /**
     * this is how factorialLoop use For..Loop work
     */
    fun factorialLoop(num: Int): Int {
        var result = 1
        println("factorial from $num is :")
        for(i in num downTo 1 step 1){
            if (i == 1) print(i)
            else print("$i*")

            result *= i
        }
        println()
        return result
    }

    /**
     * this is how RecursiveFunction work
     * Jika pemanggilan Recursive ini terlalu banyak jumlah inputan (i.e. 10.000.000) will raise
     * error stack overflow
     */
    fun factorialRecursive(num: Int): Int {
        return when(num){
            1 -> 1
            else -> num * factorialRecursive(num - 1) // input * (input-1)
        }
    }

    println(factorialLoop(5))
    println(factorialRecursive(5))

}