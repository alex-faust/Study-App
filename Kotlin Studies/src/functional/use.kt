package functional

import java.io.FileReader

fun main(args: Array<String>) {
    //use is used for try with resources for avoiding closing things
    //available for anything that has the closeable interface .close()

    FileReader("mayexist.txt").use {
        val str = it.readText()
        println(str)
        //it.close() use automatically calls it
    }
}