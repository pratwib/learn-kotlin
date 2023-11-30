package app

class Member(val name: String, val hobies: List<String>)

fun main() {
    val list = listOf(
        listOf("Moch", "Pratama", "Wibawa"),
        listOf("Moch", "Pratama", "Wibawa"),
        listOf("Moch", "Pratama", "Wibawa"),
        listOf("Moch", "Pratama", "Wibawa")
    )

    val listString = list.flatten()
    println(listString)

    val members = listOf(
        Member("Wibi", listOf("Gaming", "Coding")),
        Member("Eko", listOf("Swimming", "Cycling"))
    )

//    val hobies = members.map { it.hobies } .flatten()
    val hobies = members.flatMap { it.hobies }
    println(hobies)
}