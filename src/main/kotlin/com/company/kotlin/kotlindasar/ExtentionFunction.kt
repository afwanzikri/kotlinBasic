fun main() {
    val name: String = "Afwan"

    println(name.hello())

    name.hello2()

    "AfwanZ".hello2()
}

fun String.hello(): String = "Welcome $this"

fun String.hello2(): Unit = println("Welcome2 $this")