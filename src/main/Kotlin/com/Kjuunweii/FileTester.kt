package com.Kjuunweii

import java.io.File

fun main(args: Array<String>) {

    File("data2.txt").bufferedReader().lines().forEach {
        println(it)
    }

//    write()

}

private fun write() {
    //    File("Koutput.txt").writeText("abc")

    File("Koutput.txt").printWriter().use {
        it.println("1st line");
        it.println("2nd line");
        it.println("3nd line");
    }


    File("Koutput2.txt").bufferedWriter().use {
        it.write("1st line\n");
        it.write("2nd line\n");
        it.write("3nd line\n");
    }
}