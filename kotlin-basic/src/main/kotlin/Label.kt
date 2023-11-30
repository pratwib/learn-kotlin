fun labelBreak() {
    loopi@ for (i in 1..10){
        loopj@ for (j in 1..10){
            if (i > 5) {
                break@loopi
            }
            println("$i x $j = ${i * j}")
        }
    }
}

fun labelContinue() {
    loopi@ for (i in 1..10){
        loopj@ for (j in 1..10){
            if (j == 5) {
                continue@loopi
            }
            println("$i x $j = ${i * j}")
        }
    }
}

fun main() {
    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("") test@{
        if (it == "") {
            return@test
        } else {
            println("Wibi")
        }
    }
}