package OO

fun Int.isEven() = (this % 2 == 0)

fun City.isLarge() = population > 1_000_000

fun main(args: Array<String>) {
    println(5.isEven())

    val naturals = listOf(2,3,11,3,8,2)
    println(naturals.filter { it.isEven() })

    val austin = City()
    austin.name = "Auston"
    austin.population = 950_000
    println(austin.isLarge())
}