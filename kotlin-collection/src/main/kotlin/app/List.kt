package app

fun main() {
    val list = listOf("Muhammad", "Pratama", "Wibawa")

    println(list[0])
    println(list.get(1))
    println(list[2])
    println(list.indexOf("Muhammad"))
    println(list.indexOf("Nggak Ada"))
    println(list.contains("Pratama"))
    println(list.contains("Tidak Ada"))
    println(list.containsAll(listOf("Pratama", "Wibawa")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}