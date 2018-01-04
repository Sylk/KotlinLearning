package oo

open class Being
open class Reptile: Being()
class Snake: Reptile()


fun main(args: Array<String>) {
    // Covariance -> objects of "more derived" type (subclass) can be used interchangeably with parent types
    val coldBois: MutableList<Reptile> = mutableListOf(Reptile(), Reptile())
    coldBois.add(Snake()) // covariance

    // coldBois.add(Being()) // Contra-variance does not work "less derived" type

}