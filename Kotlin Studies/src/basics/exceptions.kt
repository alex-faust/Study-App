package basics

import java.io.IOException

fun main(args : Array<String>)
{

    val input = try {
        getExternalInput()
    } catch (e: IOException) {
        e.printStackTrace()
        ""
    } finally {
        println("finished processing external input")
    }
    println(input)
}

fun getExternalInput(): String {
    throw IOException("Could not read external input")
}
//WHY NO CHECKED EXCEPTIONS IN KOTLIN???