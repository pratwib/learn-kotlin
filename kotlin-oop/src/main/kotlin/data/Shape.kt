package data

open class Shape {
    open val corner: Int = -2
}

class Rectangle : Shape() {
    override val corner: Int = 3
    val parentCorner: Int = super.corner
}

class Triangle : Shape() {
    override val corner: Int = 7
}