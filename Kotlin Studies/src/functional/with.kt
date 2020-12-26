package functional

fun main(args: Array<String>)
{
    val props = System.getProperties()

    with(props) {
        //props.list
        println(list(System.out))
        //props.propertyNames()
        println(propertyNames().toList())
        println(get("user.home"))
    }


}