package exceptions

import java.io.IOException

fun main(args: Array<String>) {
    val input = try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
        "Default string"
    } finally {
        println("Finished trying to get external input")
    }

    println(input)

}

fun getExternalInput(): String {
    throw IOException("Could not read external input ")
}