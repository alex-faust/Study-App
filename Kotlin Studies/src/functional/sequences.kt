package functional

import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {

    val veryLongList = (1..999999L).toList()

    //in this example, take should be called sooner because you are
    //evaluating all the numbers first THEn taking the first 1000 which
    //would take a very long time
    /*val sum = veryLongList.filter { it > 50 }
            .asSequence() //means it will only take 1000 i guess
            .map { it * 2 }
            .take(1000) //if you do take before filter, you would lose out on 50 items
            .sum()*/

    //val seq = generateSequence(1, { it + 1 })

    var sum = 0L
    var lazySum = 0L

    val msNonLazy = measureTimeMillis {
        sum = veryLongList.filter { it > 50 }
                .map { it * 2 }
                .take(1000)
                .sum()
    }
    val msLazy = measureTimeMillis {
        lazySum = veryLongList.filter { it > 50 }
                .asSequence()
                .map { it * 2 }
                .take(1000)
                .sum()
    }
    println("lazy: $msLazy ms, Result: $sum")
    println("Non lazy: $msNonLazy ms, Result: $sum")
}