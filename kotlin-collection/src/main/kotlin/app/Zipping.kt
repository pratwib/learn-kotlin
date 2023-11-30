package app

fun main() {
    val list1 = listOf("Moch", "Pratama", "Wibawa")
    val list2 = listOf("Programmer", "Zaman", "Now")

    val list3 = list1.zip(list2)
    println(list3)

    val list4 = list1.zip(list2) { value1, value2 ->
        "$value1 $value2"
    }
    println(list4)
}