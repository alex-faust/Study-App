package functional

fun main(args: Array<String>)
{
    val timesTwo = { x: Int -> x*2 }
    val add = {x: Int, y: Int -> x+y }

    //higher order functions,
    // takes in functions as argument or parameters
    // they return a function
    val list = (1..100).toList()
    //print(list.filter({ element -> element % 2 == 0}))
    //you can use 'it' if the function has only 1 variable
    //print(list.filter({ it % 2 == 0}))
    //print(list.filter({ it.even()}))
    //println(list.filter(::isEven)) //takes integer and applies it to every item in the list
    list.filter { it.even() } //lambda is only or last parameter, remove the parenthesis




}

// a function that is added to Integer that will return if it is even
fun Int.even() = this % 2 == 0

fun isEven(i: Int) = i % 2 == 0