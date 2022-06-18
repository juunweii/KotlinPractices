package com.Kjuunweii

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {

    val enterT : LocalDateTime = LocalDateTime.of(2022, 6, 4, 8,0,0)
    val leaveT : LocalDateTime = LocalDateTime.of(2022, 6, 4, 10,25,0)


    var car = Car("AA-0001" , enterT)

    car.leaveT = leaveT


    println(car.duration())

    val hours = car.duration().toDouble()/60
    println(hours)

    val price = Math.ceil(hours).toInt() * 30
    println("停車費：$price 元")

}


class Car(val id:String , val enterT : LocalDateTime){

    var leaveT : LocalDateTime? = null
        set(value) { //main傳進來的leaveT就是value
            if (enterT.isBefore(value)){
                //this.leaveT = value  //Setter裡面不可以使用this.，不然程式會以為又要進入set，變無窮迴圈，要改用field
                field = value
            }
        }

    fun duration() = Duration.between(enterT , leaveT).toMinutes()

}