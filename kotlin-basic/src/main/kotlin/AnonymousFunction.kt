fun main() {
    fun hello(value: String, transformer: (String) -> String): String {
        val nameTransform = transformer(value)
        return "Hello $nameTransform"
    }

    val upper = fun (value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.uppercase()
        }
    }

    println(hello("pratama", upper))
    println(hello("", upper))
    println(hello("pratama", fun (value: String): String{
        if (value == "") {
            return "UPS"
        } else {
            return value.lowercase()
        }
    }))
}