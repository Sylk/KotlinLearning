package oo

fun main(args: Array<String>) {
    val vehicle: Drivable = Bicycle()

    vehicle.drive()

    // check for instance of and then use extensions
    if (vehicle is Bicycle) {
        vehicle.dropKickstand()
    } else if (vehicle is Car) {
        vehicle.build()
    }
}