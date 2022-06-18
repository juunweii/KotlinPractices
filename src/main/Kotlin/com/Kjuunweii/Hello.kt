package com.Kjuunweii

fun main(args: Array<String>) {
//    println("Hello Kotlin")


//    Human().hello()

    val h = Human(60.6f,1.69f)  //建構Human物件
//    h.hello()
//
//
//    var name : String;
//    name = "Walton";


    println(h.bmi())

}

class Human(var weight:Float, var height:Float , var name:String=""){
    init{
        println("test+$weight") //可在主建構子下多寫一點程式（用init)
    }

//    constructor(name: String, weight: Float, height: Float):this(weight, height) //副建構子


    fun bmi():Float{
        var bmi=weight/(height*height)
        return bmi
    }

    fun hello(){
        println("Hello Kotlin")
    }
}