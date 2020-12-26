package OO

//private - same as in Java
//only visible inside class or File

//protected - same as in java
//only visible inside same class and visible in subclasses

//public -  same as in java
//accessable anywhere

//internal - visible inside same module ( a set of kotlin files piled together

class Car(val brand: String, private val model: String) {
     fun tellMeYourModel() = model
}

fun main(args: Array<String>) {
    val car = Car("BRAND", "MODEL")
    car.brand
    //cant access model because it is private
    car.tellMeYourModel()
}
