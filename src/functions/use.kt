package functions

import java.io.FileReader

fun main(args: Array<String>) {
    // use -> can be used with any object that implements Closeable interface
    FileReader("mayexist.txt").use {
        println(it.readText())
    }
}