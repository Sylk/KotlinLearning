package oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

object CountryFactory {
    val a = 4
    fun createCountry() = Country("Australia", 1_600_000)
}

object DefaultClickListener: MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
        println("Mouse was clicked")
    }
}

fun main(args: Array<String>) {
    val newCountry = CountryFactory.createCountry()
}