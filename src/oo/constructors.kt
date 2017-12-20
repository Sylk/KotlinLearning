package oo

// property fields defined in constructor and default setters are made
class Country(private val name: String, private val areaSqKm: Int) {

    fun printFmt() = "$name, $areaSqKm km^2"
}

fun main(args: Array<String>) {
    val australia = Country("Australia", 7_700_000)

    println(australia.printFmt())
}