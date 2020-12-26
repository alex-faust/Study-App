package OO
//open by default
abstract class Shape(val name: String) {
    //doesnt need a value because it can never be called and will
    //have to be overriden
    abstract fun area(): Double
}

class Circle(name: String, val radius: Double) : Shape(name) {
    override fun area() = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {
    val shape = Circle("Large circle", 17.0)
    println(shape.area())
}