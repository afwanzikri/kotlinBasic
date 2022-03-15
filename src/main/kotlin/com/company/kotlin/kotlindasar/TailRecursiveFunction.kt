fun main() {

    /**
     * While don't use "tailrec" function, recursive will raise an error if input 100.000
     */
    /*
     tailrec fun display(num: Int) {
        println("$num ")
        if(num > 0) display(num - 1)
    }

//    display(15535) // recursive without use tailrec will work in iterate (i.e 15535)
    display(10000000)
     */

    tailrec fun factorial(num : Int, total: Int = 1): Long {
        return when(num){
            1 -> total.toLong()
            else -> factorial(num - 1, total * num)
            /*
                factorial(input-1, total * input) -> i.e input = 4
                factorial((4-1), (1*4)) -> factorial(3, 4)
                factorial((3-1), (4*3)
                factorial((2-1), (12*2))
                factorial((1-1), (24*1))
             */
        }
    }

    println(factorial(4))

}