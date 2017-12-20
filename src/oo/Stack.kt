package oo

class Stack<E>(vararg val items: E) {
    var elements = items.toMutableList()

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
    fun push(element: E) {
        elements.add(element)
    }

    fun pop(): E {
        return elements.removeAt(elements.size - 1)
    }
}

fun <T>stackOf(vararg elements: T): Stack<T> {
    return Stack(*elements)
}


fun main(args: Array<String>) {
    val stack = Stack(3, 5, 7, 8)

    val stack2 = stackOf("alpha", "beta", "gamma")

    while (!stack.isEmpty()) {
        println(stack.pop())
    }

    while (!stack2.isEmpty()) {
        println(stack2.pop())
    }
}