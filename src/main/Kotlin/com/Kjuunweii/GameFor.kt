package com.Kjuunweii

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10)+1

    for (i in 1..4){
        println("Please enter a number(${i}/4): ")
        var number = scanner.nextInt()
        if (number>secret)
            println("Lower")
        else if (number<secret)
            println("Higher")
        else if (number == secret){
            println("Correct! The answer is $secret")
            break
        }
        else if (number==-1){
            break
        }

    }
    println("結束")



}