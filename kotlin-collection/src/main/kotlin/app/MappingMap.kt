package app

fun main() {
    val map = mapOf(
        1 to "Moch",
        2 to "Pratama",
        3 to "Wibawa"
    )

    val mapKeys = map.mapKeys { it.key * 10 }
    println(mapKeys)

    val mapValues = map.mapValues { it.value.uppercase() }
    println(mapValues)
}