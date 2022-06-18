package com.Kjuunweii

import java.util.*

fun main(args: Array<String>) { //用"main"快速產生main


//  userInput()
    kStudent.pass = 50

    val stu = kStudent("Tom", 100, 99)
    val stu2 = kStudent("TT", 59, 60)
    val stu3 = kStudent("JJ", 45, 49)

    val gstu = GraduatekStudent("Josh" , 60 ,60,60)
    gstu.print()

    stu.print()
    stu2.print()
    stu3.print()
    println("Highest score: ${stu.highest()}")

}

class GraduatekStudent(name: String, english: Int, math: Int, var thesis: Int ):kStudent(name, english, math){
    companion object {
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFail()}\n${grading()}")
    }

    override fun passOrFail(): String = if (getAverage()>=pass) "\tPass" else "\tFail"

}

open class kStudent(var name:String, var english:Int , var math:Int){

    companion object {
        @JvmStatic
        var pass = 60
        fun test(){
            println("testing")
        }
    }

/*
    fun print(){
        println("Name: "+name+"\n"+english+"\t"+math+"\t"+getAverage()
            +passOrFail())
        println(grading())
    }*/

    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFail()}\n${grading()}")
    }


    fun grading(): Char{
        var grading:Char = when(getAverage()){
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            in 50..59 -> 'E'
            else -> 'F'
        }
        return grading
    }


    open fun passOrFail() = if (getAverage()>=pass) "\tPass" else "\tFail"

    fun highest() : Int{

        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
        return max
    }

    fun getAverage():Int{
        return (english + math)/2
    }

}



private fun userInput() {
    val scanner = Scanner(System.`in`)

    print("Please enter student's name: ")
    var name = scanner.next();
    print("English score: ")
    var english = scanner.nextInt();
    print("Math score: ")
    var math = scanner.nextInt();

    val stu = kStudent(name, english, math)

    stu.print()
}
