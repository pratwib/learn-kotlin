package app

fun main() {
    val list = listOf("a", "a", "b", "b", "c", "c", "c")
    val grouping = list.groupingBy { it }

    println(grouping.eachCount())

    val fold = grouping.fold("") { first, second -> first + second}
    println(fold)

    val reduce = grouping.reduce { key, first, second -> first + second }
    println(reduce)

    val aggregate = grouping.aggregate { key, first: String?, second, isFirst ->
        if (isFirst) first
        else first + second
    }
    println(aggregate)
}