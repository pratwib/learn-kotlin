package app

import data.Student

fun main() {
    val student = Student("Wibi", 15)

    val result = student.let {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result)

    val result2 = student.run {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result2)

    val result3 = student.apply {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result3)

    val result4 = student.also {
        "Name ${it.name}, Age ${it.age}"
    }
    println(result4)

    val result5 = with(student) {
        "Name ${this.name}, Age ${this.age}"
    }
    println(result5)
}