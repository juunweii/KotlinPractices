package com.Kjuunweii

import java.util.*

fun main(args: Array<String>) {
//    val scanner = Scanner(System.`in`)

    val secret = Random().nextInt(10)+1

    var number = 0

    while( number != secret ){
        println("Please enter a number: ")
//        number = scanner.nextInt()

        number = readLine()!!.toInt()

        if (number<secret){
            println("Larger")

        }
        else if (number>secret){
            println("Lower")
        }
        else{
            println("Correct! The number is $number")
        }
    }





}