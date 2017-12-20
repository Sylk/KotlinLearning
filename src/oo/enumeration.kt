package oo

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);

    fun containsRed(): Boolean {
        return this.rgb and 0xFF0000 != 0
    }
}