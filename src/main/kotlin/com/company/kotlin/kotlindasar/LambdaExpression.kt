fun main() {

    /**
     * Declare Lambda Expression :
     * val (variableName): (Parameter) -> (return_data_type) = {param -n: dataType ->
     * }
     */
//    val exLambda: (value1: String, value2: String) -> (String) = { value1, value2 -> // This Declaration could be used as Lambda Expression
    val exLambda: (String, String) -> (String) = { value1: String, value2: String -> // Or used this declaration
        val result = "$value1 $value2"
        result
    }
    println("result of lambda = ${(exLambda("Lambda", "Expression"))}")

    val calcUseLambda1: (Int, Int) -> (Int) = { val1: Int, val2: Int ->
        val result = val1 * val2
        result
    }
    println(calcUseLambda1(2,4))

    /**
     * Declare Lambda Expression with 1 Parameter :
     * val (variableName): (Parameter) -> (returnDataType) = {
     * _execution_
     * }
     */

    val toUpperCase: (String) -> (String) = {
        it.uppercase()
    }
    println(toUpperCase("caStINg To UpperCase"))

    var castIntToString: (Int) -> (String) = { it.toString() }
    println(castIntToString(123456789))

    /**
     * This is how to use Lambda Method Reference
     * call outer method with same parameter use lambda
     */
    val lambdaMethodRef: (String) -> (String) = ::funcUpperCase
//    println(funcUpperCase("casting_tO_upPerCAse")) // This assignment could be executed without call lambda
    println(lambdaMethodRef("casting_tO_upPerCAse"))

}

fun funcUpperCase(param1: String) : String = param1.uppercase()