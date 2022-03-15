fun main() {

    /**
     * Ini adalah comment tidak dieksekusi
     * println("a")
     */

    /**
    * // Conditional if-else
    */
    /*
    val score = 80

    if (score > 90) println("GG bro")
    else if (score > 80) println("keep it up bro")
    else if (score > 70) println("almost bro")
    else println("try harder bro")
     */

    /**
     * Conditional WHEN
     */
    /*
    val grade = 'E'

    when(grade){
        /*
        'A' -> println("say anything")
        'B', 'C', 'D' -> println("this line will up an error")
         */

        'A', 'B', 'C' -> {
            println("statement_1")
            println("statement_2")
        }
        else -> println("speechless")
    }
     */

    /**
     * Conditional WHEN and application with Array
     */
    /*
    val scoreExam = 'D'
    val passValue:Array<Char> = arrayOf('A', 'B', 'C')

    when(scoreExam){
        in passValue -> println(message = "Pass")
        !in passValue -> println("Try harder")
    }
     */

    val name = "afwan"
    when (name){
        is String -> println("variable name is String where value = $name")
        !is String -> println("variable name is not String")
    }

}