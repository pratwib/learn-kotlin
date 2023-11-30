package app

import kotlin.text.StringBuilder

fun main() {
    val list = listOf("Moch", "Pratama", "Wibawa")

    val string1 = list.joinToString(" ", "|", "|")
    println(string1)

    val string2 = list.joinToString(" ", "|", "|") { it.uppercase() }
    println(string2)

    val builder = StringBuilder()
    list.joinTo(builder, " ", "|", "|")
    list.joinTo(builder, " ", "@", "@")
    list.joinTo(builder, " ", ">", "<")

    val string3 = builder.toString()
    println(string3)
}