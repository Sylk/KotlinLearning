package oo

fun Int.isEven() = (this % 2 == 0)

fun main(args: Array<String>) {
    println(5.isEven())
    println(6.isEven())

    val someNumbers = listOf(1, 3, 2, 5, 6, 22)

    println(someNumbers.filter { it.isEven() })
}

