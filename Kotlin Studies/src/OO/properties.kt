package OO

class City {
    var name: String = ""
        get() = field
        set(value) {
            if(value.isNotBlank())
            {
                field = value
            }
        }
    var population: Int = 0

}

fun main(args: Array<String>) {
    val berlin = City()
    berlin.name = "Berlin" //implicitly calls the setter method for the class
    berlin.name = " "
    berlin.population = 3_500_000

    println(berlin.name) //implicitly calls the getter method for the class
    println(berlin.population)
}