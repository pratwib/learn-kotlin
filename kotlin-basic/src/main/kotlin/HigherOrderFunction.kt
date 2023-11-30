fun main() {
    fun hello(value: String, transformer: (String) -> String): String {
        val nameTransform = transformer(value)
        return "Hello $nameTransform"
    }
    val lambdaUpper = {value: String -> value.uppercase()}
    println(hello("Wibi", lambdaUpper))

    println(hello("Pratama", {value: String -> value.lowercase()}))

    val result1 = hello("wibi", {value: String -> value.uppercase()})
    val result2 = hello("wibi") {value: String ->
        value.lowercase()
    }
    println(result1)
    println(result2)
}