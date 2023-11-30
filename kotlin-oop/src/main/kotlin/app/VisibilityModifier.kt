package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = Teacher("Wibi")
    println(teacher.name)
    // teacher.teach() ERROR

    val superTeacher = SuperTeacher("Budi")
    superTeacher.test()
}