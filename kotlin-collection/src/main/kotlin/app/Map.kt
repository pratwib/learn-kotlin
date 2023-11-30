package app

fun main() {
    val map = mapOf(
        Pair("a", "Muhammad"),
        "b" to "Pratama",
        "c" to "Wibawa"
    )

    println(map.size)

    for ((key, value) in map) {
        println("$key to $value")
    }
}