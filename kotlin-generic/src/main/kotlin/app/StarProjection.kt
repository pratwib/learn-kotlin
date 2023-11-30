package app

fun displayLength(array: Array<*>) {
    println("Total array is ${array.size}")
}

fun main() {
    val arrayString = arrayOf("Wibi", "Tya", "Dani", "Icih")
    val arrayInt = arrayOf(1, 6, 7, 12, 5, 13)

    displayLength(arrayString)
    displayLength(arrayInt)
}