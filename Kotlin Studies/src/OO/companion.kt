package OO

class House(val numberOfRooms: Int, val priec: Double) {
    companion object {
        val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_999.0)
        fun getLuxuryHouse() = House(42, 7_000_000.0)
    }
}

fun main(args: Array<String>) {
    val normalHouse = House.getNormalHouse()
    println(normalHouse)

    println(House.HOUSES_FOR_SALE)
}