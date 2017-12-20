package oo

abstract class Shape(val name: String) {
    abstract fun area(): Double
}

class Circle(name: String, val radius: Double): Shape(name) {
    override fun area(): Double = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {
    val shape: Shape = Circle("my circle", 2.0)

    println(shape.name)
    println(shape.area())
}