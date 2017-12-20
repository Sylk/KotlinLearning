package oo

open class Animal {
    protected var name: String = "None"
    private var color: String = "Blue"

    internal val isDangerous = true // can be accessed by anything in the same module

    var age: Int = 0
        get() = field * 2
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    fun myName(): String {
        return name
    }
}

class Vertibrate: Animal() {
    fun sayName() {
        println("My name is $name")
    }
}

fun main(args: Array<String>) {
    val cat = Animal()
    val dog = Vertibrate()

    dog.sayName()

    cat.age = 12
    println(cat.age)

    println(cat.myName())
}