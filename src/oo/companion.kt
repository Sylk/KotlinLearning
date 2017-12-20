package oo

class House(val numberOfRooms: Int, val price: Double) {

    // can be used on the base class -> can implement interfaces like factory interface
    companion object {
        val HOUSE_IS_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_000.0)
        fun getLuxuryHouse() = House(15, 1_400_000.0)
    }
}

fun main(args: Array<String>) {
    val building = House.getLuxuryHouse()

}