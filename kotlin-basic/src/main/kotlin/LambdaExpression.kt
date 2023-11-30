fun toUpper(value: String): String = value.uppercase()

fun main() {
    val contohLambda: (String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }
    val result = contohLambda("Pratama", "Wibi")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Wibi"))

    val upperCase: (String) -> String = ::toUpper
    println(upperCase("Ajis Gagap"))
}