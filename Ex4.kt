package com.example.ex4

import java.lang.reflect.Type

fun main() {
    val Emptyarr = ArrayList<Double>()
    Emptyarr.add(2.3)
    Emptyarr.add(3.4)
    Emptyarr.add(26.2)
    Emptyarr.add(5.3)
    Emptyarr.add(4.9)
    var sum = 0.0
    for (Dnumber in Emptyarr){
        sum += Dnumber
    }
    println("The average is: ${sum/Emptyarr.size}")

}