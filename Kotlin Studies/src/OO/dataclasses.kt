package OO

//this will not generate a hashCode(), equals(),
//toString(), copy(), destructuring operator
data class Address(val street: String, val number: Int, val postCode: String,val city: String )

fun main(args: Array<String>) {
    val residence = Address("Main street", 42, "1234", "New York")
    val residence2 = Address("Main street", 42, "1234", "New York")

    //toString()
    println(residence) //now you can print it because it uses the toString method

    //checks for referential equality
    println(residence === residence2) //different objects so they point to different places in memory

    //checks for structural equality
    println(residence == residence2)

    //copy() with value of number changed
    val neighbor = residence.copy(number = 43)
    println(neighbor)

    //destructuring operator
    residence.component1()
    val (street, number, postCode, city) = residence
    println("$street $number, $postCode $city" )

}