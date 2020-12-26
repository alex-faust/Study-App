package functional

//this function takes a string as a parameter,
// and operation on a string to a string
// and returns a string
//noinline keyword is if you have multiple lambdas/operations
// and you dont want one of them to be inline
inline fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}

fun main(args: Array<String>) {
    modifyString("Kotlin is amazing", { it.toUpperCase() })
}