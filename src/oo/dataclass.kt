package oo

// hashCode(), equals(), toString(), copy, destructuring operator
data class Book(val title: String, val author: String, val publicationYear: Int, var price: Double)

fun main(args: Array<String>) {
    val book = Book("War and Peace", "Leo Tolstoy", 1578, 29.99)

    val secondBook = book.copy(price = 17.29)

    println(book == secondBook) // structural equals
    println(book === secondBook) // reference equality (same object)

    val (title, author, _, price) = book // destructuring with no val for pubYear

    val set = hashSetOf(book, secondBook) // correctly does not add duplicates with data classes

    println(book)
    println("The author of this book is $author")
    println("Second Book is:")
    println(secondBook)

    println(set.contains(book))

}
