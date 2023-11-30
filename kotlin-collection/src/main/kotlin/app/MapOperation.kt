package app

fun main() {
    val map = mapOf("a" to "Moch", "b" to "Pratama", "c" to "Wibawa")

    println(map.getValue("b"))
    println(map.getOrElse("Gaada") { "Upss" })
    println(map.filter { entry -> entry.value.length > 5 })
    println(map.filterKeys { it != "c" })
    println(map.filterValues { it.length < 5 })
}