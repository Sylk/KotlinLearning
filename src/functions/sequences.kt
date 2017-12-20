package functions

fun main(args: Array<String>) {
    val veryLongList = (1..999999L).toList()

    val sum = veryLongList
            .asSequence()
            .filter { it > 50 }
            .take(1000)
            .map { it * 2 }
            .sum()

    val seq = generateSequence ( 1, { it + 1 } )

    println(sum)
    println(seq.take(10).toList())
}