package io

fun main(args: Array<String>) {
    print("Enter the word to guess: ")
    val word = readLine()
    if (word == null) {
        println("No word given.")
        return
    }

    for (i in 1..100) {
        println()
    }

    val letters = word.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses) {
        print("Enter letter guess: ")
        val input_word = readLine()
        if (input_word != null && input_word.length == 1) {
            val guessLetter = input_word.toCharArray()[0]
            if (letters.contains(guessLetter)) {
                correctGuesses.add(guessLetter)
            } else {
                fails++
            }
        }

        printExploredWord(word, correctGuesses)
    }

    println("#Wrong guesses: $fails\n\n")
    println("Well done.")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (letter in word) {
        if (correctGuesses.contains(letter)) {
            print(letter + " ")
        } else {
            print("_ ")
        }
    }
    println()
}