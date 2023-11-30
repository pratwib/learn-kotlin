package app

fun main() {
    listOf("Moch", "Pratama", "Wibawa").forEach {
        println(it)
    }

    mutableListOf("Moch", "Pratama", "Wibawa").forEachIndexed { index, value ->
        println("$index = $value")
    }
}