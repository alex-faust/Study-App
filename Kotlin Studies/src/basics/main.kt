package basics

import java.util.*

val PI = 3.1415 //you can do this outside the main class
fun main(args: Array<String>)
{
    val list = listOf("Kotlin", "Android")
    println(list)
    println(PI)

    /*val anonymous = "Anonymous"
    print("Enter your name ")

    val input = readLine()
    val name = if(input != null && input.isNotBlank())
    {
        input
    } else {
        anonymous
    }

    val message = if (name == anonymous)
    {
        "Conscious about your privacy eh?"
    } else {
        "Welcome $name, the CIA has been informed of your name : "
    }

    println(message)*/

    /*var randoms: MutableList<Int> = mutableListOf()
    for(i in 1..100)
    {
        randoms.add(Random().nextInt(100 + 1))
    }

    var i = 0
    while (i < randoms.size && randoms[i] > 10)
    {
        println(randoms[i])
        i++
    }*/

    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )

    val averageAge = data.flatMap { it.value }
            .filter { it >= 0 }
            .average()
    val faultyFiles = data.filter { it.value.any { it < 0}}
            .map { it.key }
    val numberOfFaults = data.flatMap { it.value }
            .filter { it < 0 }
            .count()

    println("Users average %.2f years of age.".format(averageAge))
    println("Files with faulty data: $faultyFiles")
    println("There were $numberOfFaults errors in the data.")
}