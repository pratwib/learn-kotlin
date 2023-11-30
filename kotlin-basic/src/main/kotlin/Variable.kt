const val APP = "Belajar Java"
const val VERSION = "0.2.1"

fun main() {
    val firstName = "Wibi"
    val age = 30

    println(firstName)
    println(age)

    var name: String? = null
    name = "Wibi"
    println(name)
    println(name?.length)

    println("$APP ini versi $VERSION")
}