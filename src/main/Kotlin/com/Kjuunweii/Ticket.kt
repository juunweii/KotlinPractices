package com.Kjuunweii

import java.util.*

data class Ticket(val origin: Int , val destination: Int, val price: Int)

fun main(args: Array<String>) {
    val t = Ticket(20,100,300)


    val s = "abcde"
    println(s.validate())


    println((1..10).random())

}

//擴充String類別來增加新功能（Exrensions)
fun String.validate() :Boolean{
    return this.length >= 6
}



fun IntRange.random() :Int{
    val r = Random().nextInt(endInclusive-start)+start
    return r
}