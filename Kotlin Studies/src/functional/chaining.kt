package functional

fun main(args: Array<String>) {

    val inputRows = listOf(
            mapOf("input01.csv" to listOf(3,5,-9977, 7, 11, 66)),
            mapOf("input02.csv" to listOf(1,3,4)),
            mapOf("input03.csv" to listOf()),
            mapOf("input04.csv" to listOf(9989, 33, 14, 12, 5))
    )

    //values only refers to the values, i assume keys would be the opposite
    //its plural because it's a list
    val cleaned = inputRows.flatMap { it.values}
            .flatten() //makes it 1 array
            .filter { it in 0..100 }
            //.sorted()
            .toIntArray()

    println(cleaned.joinToString())
}