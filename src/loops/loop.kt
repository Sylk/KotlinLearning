package loops

fun main(args: Array<String>) {
    for (i in 1..10) {
        println(i)
    }

    val names = listOf("Albert", "Crinda", "Ashley")

    for ((index, value) in names.withIndex()) {
        println("The value at $index is $value")
    }
}