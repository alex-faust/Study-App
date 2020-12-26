package functional

fun main(args: Array<String>)
{
    //take() only returns first n elements
    //drop() will drop the first n elements
    val list = generateSequence(0)
    {
        println("Calculating ${it+10}")
        it + 10
    }
    //its best to do take first because you only wanna do
    //the calculations on the ones that are needed
    //there is also a first and last you can put as take or drop parameter
    val first10 = list.take(10).map {  }.toList()
    val first20 = list.take(20).toList()

    println(first10)
    println(first20)
}