package io

import java.util.*

fun main(args: Array<String>) {
    val magicNum = Random().nextInt(100) + 1
    var input: String?
    var guess = -1

    while (guess != magicNum) {
        print("Guess a number between 1 and 100: ")
        input = readLine()
        if (input != null) {
            guess = input.toInt()
        }

        if (guess < magicNum) {
            println("Too low!")
        } else if (guess > magicNum) {
            println("Too high")
        }
    }
}