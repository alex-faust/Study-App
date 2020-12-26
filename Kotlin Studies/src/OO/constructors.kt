package OO

class Country(val name: String, val areaSqKm: Int) {
    //val area: Int = areaSqKm
    //can only move to constructor is the variable names are the same


    /*init {
        //stuff to be executed whenever an object of this class is created
    }*/

    //having multiple constructors, always have to refer to main constructor
    constructor(name: String): this(name, 0) {
        println("Constructor called")
    }
    fun print() = "$name, $areaSqKm km^2"
}

fun main(args: Array<String>) {
    val australia = Country("Australia", 7_700_000)
    println(australia.name)
    println(australia.areaSqKm)

    val spain = Country("Spain")
    println(spain.name)
    println(spain.areaSqKm)
}