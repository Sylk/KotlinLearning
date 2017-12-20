package io

import java.io.File

fun main(args: Array<String>) {
    File("src/InputFile.txt").forEachLine {
        println(it)
    }
}
