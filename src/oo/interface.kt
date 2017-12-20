package oo

interface Drivable {
    fun drive()
}
interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(var color: Color): Drivable, Buildable {
    override val timeRequired: Int = 12

    override fun drive() {
        println("Driving a car")
    }

    override fun build() {
        println("Building a car")
    }
}

class Motorbike(var color: String): Drivable {
    override fun drive() {
        println("Driving a motorbike")
    }
}

class Bicycle: Drivable {
    override fun drive() {
        println("Driving a bicycle")
    }

    fun dropKickstand() {
        println("Putting down kick-stand...")
    }
}

fun main(args: Array<String>) {
    val car: Drivable = Car(Color.GREEN)
    car.drive()

    val motorbike: Drivable = Motorbike("Green")
    motorbike.drive()
}
