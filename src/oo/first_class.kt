package oo

abstract class Person (open var name: String, open var age: Int){

    init {
        println("Object was created")
    }

    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name")
        println("My name is ${this.name}")
    }

    fun getYearOfBirth() = 2017 - age
}

class Student (override var name: String, override var age: Int): Person(name, age) {
    fun isIntelligent() = true

    override fun speak() {
        println("Hi, I'm a student")
    }
}

class Employee(override var name: String, override var age: Int): Person(name, age) {
    fun recievePayment(money: Int) {
        println("Payment received in the amount of $$money")
    }

    override fun speak() {
        println("Hello I'm and employee")
    }
}

fun main(args: Array<String>) {
    var new_student = Student("Jessica", 22)
    var new_employee = Employee("Ars", 22)

    new_student.speak()
    println(new_student.isIntelligent())

    new_employee.speak()
    new_employee.recievePayment(1200)

}