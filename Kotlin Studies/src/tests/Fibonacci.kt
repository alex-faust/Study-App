package tests

fun main(args : Array<String>)
{
    var first = 0
    var second = 1
    val n = 10

    println("First $n terms are: ")
    for (i in 1..n)
    {
        print("$first + ")
        var sum = first + second
        first = second
        second = sum
    }
}