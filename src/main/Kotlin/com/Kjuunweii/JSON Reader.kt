package com.Kjuunweii

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

fun main() {

    val url = URL("https://api.kcg.gov.tw/api/service/get/f72b68ab-ad33-4c22-9e09-c520c40f3f2e")

    /*val connection = url.openConnection() as HttpURLConnection
    var br = BufferedReader(InputStreamReader(connection.inputStream))

    var line = br.readLine()
    val json = StringBuffer()

    while (line != null){
        json.append(line)
        line = br.readLine()
    }

    println(json)*/

    //方法二
    /*with(url.openConnection() as HttpURLConnection) {
        var br = inputStream.bufferedReader().lines().forEach {
            println(it)
        }
        }*/
    //方法三
    println(url.readText())


    

    }

