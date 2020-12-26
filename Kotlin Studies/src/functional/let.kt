package functional

import java.io.File

fun main(args: Array<String>)
{
    //let
    /*File("example.txt").bufferedReader().let {reader ->
        if(reader.ready()){
            println(reader.readLine())
        }
    }*/

    File("example.txt").bufferedReader().let {
        if(it.ready()){
            println(it.readLine())
        }
    }
    // reader should not be visible

    val str: String? = "Kotlin for Android"
    str?.let { //use the null call and if it is null, it wont get into the block
        if (str.isNotEmpty()) {
            str.toLowerCase() //dont need null call because it wont get here if it is null
        }
    }





}