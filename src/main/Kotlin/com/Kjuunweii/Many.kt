package com.Kjuunweii

import java.time.LocalDateTime

fun main(args: Array<String>) {

    val parkingLot = HashMap<String , Car?>()

    var enter = LocalDateTime.of(2022,6,7,8,0,0)
    var car:Car? = Car("AA-0001" , enter)

    parkingLot.put(car!!.id , car)

    car = Car("BB-0002" , enter.plusMinutes(15))
    parkingLot.put(car.id , car)

//    Car 1 leaving
    var leave = LocalDateTime.of(2022,6,7,9,0,0)
    car = parkingLot.get("AA-0001")
    car?.leaveT = leave
    println("${car?.id} duration : ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

//    Car 2 leaving

    car = parkingLot.get("BB-0002")
    car?.leaveT = leave.plusHours(2)
    println("${car?.id} duration : ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)






    /*  val list = listOf(1,2,3,4)
      println(list)

      for (i in list){
          println(i)
      }


      var mutableList = mutableListOf(1,2,3,4)
      mutableList.add(5)
      println(mutableList)*/
}