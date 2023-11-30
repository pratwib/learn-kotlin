fun sum(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(x: Int, y: Int): Int {
    if (y == 0) {
        return 0
    } else {
        val result = x / y
        return result
    }
}

fun main() {
    println(sum(10,5))

    val result = sum(5, 8)
    println(result)

    sum(9,8) // Tidak Terdeteksi

    println(bagi(50, 2))
    println(bagi(50, 0))
}