package app

fun main() {
    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("a", "Muhammad")
    mutableMap["b"] = "Pratama"
    mutableMap["c"] = "Wibawa"

    println(mutableMap["a"])
    println(mutableMap["b"])
    println(mutableMap.get("c"))
    println(mutableMap.get("d"))
    println(mutableMap.getOrDefault("d", "Tidak Ada"))

    mutableMap.remove("a")

    for ((key, value) in mutableMap) {
        println("$key to $value")
    }
}