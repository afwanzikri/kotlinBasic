fun main() {

    val arrayOf = arrayOf("rack1", "rack2", "rack3", "rack4")

    /**
     * Looping use for loop
     */

    var bppms = arrayOf

    /*
    //1
    var count = 0
    for (bppm in bppms){
        println(bppm )
        count++
    }
    println("jumlah perulangan for loop sebanyak $count\n")

    //2
    val lengthOfBppm = (bppms.size - 1)
    for (i in 0..lengthOfBppm){
        println("index $i = ${bppms.get(i)}")
    }

    //3
    for (i in 0..100 step 2){ // use datatype range
        println(i)
    }
    */

    /**
     * Output :
     * *****
     * *****
     * *****
     * *****
     * *****
     */
    /*
    for (i in 1..10){
        for (j in 1..10){
            print("*")
        }
        println()
    }
     */

    /**
     * Output :
     * *****
     * ****
     * ***
     * **
     * *
     */
    /*
    for (i in 1..5){
        for (j in 5 downTo i step 1){
            print("*")
        }
        println()
    }
     */

    /**
     * Output :
     * *****
     *  ****
     *   ***
     *    **
     *     *
     */
    /*
    for (i in 5 downTo 1 step 1){
        for (j in 5 downTo 1 step 1){
            if (j==i || j<i) print("*")
            else print(" ")
        }
        println()
    }
     */

    /**
     * Output :
     * *
     * **
     * ***
     * ****
     * *****
     */
    /*
    for (i in 1..5){
        for (j in 1..i){
            print("*")
        }
        println()
    }
     */

    /**
     * Output :
     *     *
     *    **
     *   ***
     *  ****
     * *****
     */
    /*
    for (i in 5 downTo 1 step 1){
        for (j in 1..5){
            if (j==i || j>i) print("*")
            else print(" ")
        }
        println()
    }
     */

    /**
     * Output :
     * 5****
     * *4***
     * **3**
     * ***2*
     * ****1
     */
    /*
    for(i in 5 downTo 1 step 1){
        for (j in 5 downTo 1 step 1){
            if (j==i) print(i)
            else print("*")
        }
        println()
    }
     */

    /**
     * Output :
     * ****5
     * ***4*
     * **3**
     * *2***
     * 1****
     */
    /*
    for(i in 5 downTo 1 step 1){
        for (j in 1..5){
            if (j==i) print(i)
            else print("*")
        }
        println()
    }
     */


    /**
     * Output :
     * 1****
     * *2***
     * **3**
     * ***4*
     * ****5
     */
    /*
    for (i in 1..5){
        for (j in 1..5){
            if (j==i) print(i)
            else print("*")
        }
        println()
    }
     */

    /**
     * Output :
     * ****1
     * ***2*
     * **3**
     * *4***
     * 5****
     */

    for (i in 1..5){
        for (j in 5 downTo 1 step 1){
            if (j==i) print(j)
            else print("*")
        }
        println()
    }

}