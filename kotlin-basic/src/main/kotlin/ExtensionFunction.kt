fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Wibi"

    println(name.hello())

    name.printHello()

    "Pratama".printHello()
}