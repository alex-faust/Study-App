package OO

//interfaces do not have constructors
interface Drivable {
    val a: Int
    fun drive()
}

class Bicycle(override val a: Int = 42) : Drivable {
    override fun drive() {
        println("Driving bicycle")
        println(a)
    }
}

class Boat(override val a: Int) : Drivable {
    override fun drive() {
        println("Driving boat")
    }

}