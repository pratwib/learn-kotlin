class Calculator {
    fun divide(first: Int, second: Int): Int {
        if (second == 0) {
            throw IllegalArgumentException("Cant divide by 0")
        } else {
            return first / second
        }
    }

    fun add(first: Int, second: Int): Int {
        return first + second
    }
}