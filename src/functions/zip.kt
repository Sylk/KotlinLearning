package functions

fun main(args: Array<String>) {
    val list = listOf("Hi", "there", "Kotlin", "fans")
    val containsT = listOf(false, true, true, false) // contains the letter 't' in the list above

    // Pair<String, Boolean>
    val zipped: List<Pair<String, Boolean>> = list.zip(containsT)

    val mapped = list.zip(list.map { it.contains("t") })

    println(zipped)
    println(mapped)
}