package tests

fun main(args : Array<String>)
{
    //mini-max sum
    val array = readLine()!!.split(" ").map { it.toInt() }
    val lowest = array.sorted().take(4).sum()
    val highest = array.sorted().takeLast(4).sum()
    println(lowest)
    println(highest)

}