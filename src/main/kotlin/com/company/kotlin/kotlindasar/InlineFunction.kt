inline fun hello(
    param1: () -> String,
    noinline param2: () -> String
): String {
    return "hello, ${param1()} ${param2()}"
}

fun main() {

    println(hello ({ "this is an inline function"}, { "abcdefu" }))
    println(hello ({ "This is an INLINE FUNCTION too" }, {"run"}))

}