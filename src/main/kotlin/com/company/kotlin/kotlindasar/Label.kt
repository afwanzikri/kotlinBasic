fun breakWithLabel(){
    println("break with use label")
    loopI@ for (i in 1..5){
        loopJ@ for (j in 1..5){
            if (i > 2) break@loopI
            else println("$i * $j = ${i*j}")
        }
        println()
    }
}

fun continueWithLabel(){
    println("continue with use label")
    loopI@ for (i in 1..5){
        loopJ@ for (j in 1..5){
            if (j > 2) {
                println()
                continue@loopI
            }
            else println("$i * $j = ${i*j}")
        }
        println()
    }
}

fun test(param1: String, param2:(String) -> Unit): Unit = param2(param1)

fun main() {

    /**
     * Dengan penggunaan label(i.e loopI@), bisa memudahkan penggunaan/ pengaplikasian pada break, continue, or return
     */
    breakWithLabel()
    println("=====================================")
    continueWithLabel()
    println("=====================================")
    test("")test@{
        if (it.uppercase() == ("PARAM").uppercase()){
            return@test // set by default
        }else println("this is else condition")
    }

}