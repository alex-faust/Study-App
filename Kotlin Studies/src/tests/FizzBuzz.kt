package tests

fun main(args : Array<String>)
{
    for(i in 1..100) {
        val result: String =
                if (i % 15 == 0) "Fizz Buzz"
                else if (i % 3 == 0) "Fizz"
                else if (i % 5 == 0) "Buzz"
                else "$i"
        println(result)
    }

    //what i typed first draft below
    /*for ( i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("Fizz Buzz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else {
            println(i)
        }
    }*/
}