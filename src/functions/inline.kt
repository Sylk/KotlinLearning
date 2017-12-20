package functions

fun main(args: Array<String>) {
    val modified = modifyString("Kotlin is Fun!", { it.toUpperCase() })

    println(modified)
}

inline fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}
