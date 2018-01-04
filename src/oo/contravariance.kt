package oo

// Producer class (factory?)
class Source<out T>(val t: T) {
    fun produceT(): T {
        return t
    }
}

// Consumer class
class Sink<in T> {
    fun consumeT(t: T) {
        // ...
    }
}

fun main(args: Array<String>) {
    val strSource: Source<String> = Source("Producer")
    val anySource: Source<Any> = strSource  // this is possible because Source specifies it only produces (out) type T. Thus covariance`
    anySource.produceT()

    val anySink: Sink<Any> = Sink()
    val strSink: Sink<String> = anySink // in -> contravariance
    strSink.consumeT("Consumer")


    // Invariance = neither covariant nor contravariant
}