package OO

fun Bicycle.replaceWheel() {
    println("replacing wheel...")
}

fun Boat.startEngine(): Boolean {
    println("Starting engine...")
    return true
}

fun main(args: Array<String>) {

    val vehicle: Drivable = Bicycle()

    //instanceOf in java is <-> is

    if (vehicle is Bicycle)
    {
        vehicle.replaceWheel()
    } else if (vehicle is Boat) {
        vehicle.startEngine()
    }

    if (vehicle is Boat && vehicle.startEngine()) {
        //will only evaluate second condition only if the first one is true
    }

    if (vehicle !is Boat || vehicle.startEngine()) {
        //
    }

    if (vehicle !is Bicycle) {
        return
    }

    vehicle.replaceWheel()
    //you can do this because if it wasn't a bicycle, it would have returned already

}