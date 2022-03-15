fun main() {

     fun helloWorld(){
         println("This is Function Scope, this function only can access in main function")
     }

    helloWorld()
    outerFunction()

}

fun outerFunction(){
    /**
     * This function can't access fun helloWorld from kotlin's file FunctionScope
     *
     * This function have an access to other kotlin's file in the same package
     * Function below have an access to kotlin's file (name : Fun ion.kt) -> fun helloWorld()
     * fun helloWorld() is public function
     * to access source of fun helloWorld from Function.kt, place cursor on helloWorld fun
     * the comment/ documentation of function will show
     */
    println("===========================================")
    helloWorld()
}