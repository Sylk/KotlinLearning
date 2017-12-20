package oo

// not Kotlin practice to have list of members (properties) at the top of the class
class City {
    var name: String = ""
        get() = field
        set(value) { field = value}
    val population: Int = 25
}

fun main(args: Array<String>) {
    val Berlin = City()

    Berlin.name = "Berlin"
}
