fun main() {

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        ++counter
        println("Increment in Lambda : $counter")
    }

    val anonymous = fun() {
        ++counter
        println("Increment in Anonymous Function : $counter")
    }

    fun functionInc() {
        ++counter
        println("Increment in common function : $counter")
    }

    lambdaIncrement()
    anonymous()
    functionInc()

}