inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    for (i in 1..100) {
        println(hello({"Pratama"}, {"Wibi"}))
    }
}