package basics
//named arguments and default paremeter values
fun main(args : Array<String>)
{
    val together = concat(listOf("Kotlin", "Java", "Scala"), ":")
    //val together = concat(" : ", texts=listOf("Kotlin", "Java", "Scala"))
    println(together)
}

//seperator's default value is a comma so you dont have to
//pass a value for that
fun concat(texts: List<String>, seperator: String = ", ") = texts.joinToString(seperator)