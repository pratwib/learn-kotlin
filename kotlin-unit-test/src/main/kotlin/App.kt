class App {
    val greeting: String
        get() {
            return "Hello World."
        }
}

fun main(args: Array<String>) {
    println("Hello World!")

    println("Program arguments: ${args.joinToString()}")
}