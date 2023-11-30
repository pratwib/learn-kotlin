package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {
    val shape1 = Shape()
    println(shape1.corner)

    val shape2 = Rectangle()
    println(shape2.corner)

    val shape3 = Triangle()
    println(shape3.corner)
}