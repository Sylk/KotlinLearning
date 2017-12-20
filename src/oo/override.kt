package oo

abstract class Course(var topic: String, var price: Double) {
    open fun learn() {
        println("I'm learning a class on $topic")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

class Kotlin: Course("Kotlin", 24.70), Learnable {
    override fun learn() {
        // super.learn() // only works if only one super class and no interface
        super<Course>.learn()
        println("I am a new Kotlin developer")
    }
}

fun main(args: Array<String>) {
    val myCourse: Learnable = Kotlin()

    myCourse.learn()
}