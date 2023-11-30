fun hitungTotal(nama: String, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }
    return total
}

fun main() {
    val result = hitungTotal("Wibi", 5, 8, 9, 1, 10)

    println(result)
}