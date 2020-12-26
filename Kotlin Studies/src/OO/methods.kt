package OO

class Robot(val name: String) {

    fun greetHuman() {
        println("Hello human, my name is $name")
    }

    fun knowsItsName(): Boolean = name.isNotBlank()
}

fun main(args: Array<String>) {
    val fightRobot = Robot("Destroyer9000")

    if(fightRobot.knowsItsName())
    {
        fightRobot.greetHuman()
    }
}