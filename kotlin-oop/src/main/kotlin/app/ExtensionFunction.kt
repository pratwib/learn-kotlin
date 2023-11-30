package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Wibi", 22)
    student.sayHello("Dani")
    println(student.upperName)
}