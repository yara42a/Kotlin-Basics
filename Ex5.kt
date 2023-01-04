package com.example.ex5

fun main(){

    example(4.5,2.5)
}
fun example(num1:Double,num2:Double,word: String="+") {
    val arr = arrayListOf("+", "-", "*", "/")
    for (arr in word)
        when (word) {
            "+" -> println("${num1 + num2}")
            "-" -> println("${num1 - num2}")
            "*" -> println("${num1 * num2}")
            "/" -> println("${num1 / num2}")
    }
}

/*
fun secondL (yara:String): Char{
   return yara[yara.length-2]

}
   write a function that accepts one parameter if type string then return
    the second last letter from this parameter
    */

/*
val array= arrayListOf("Saleh", 4 , 4.5, true)

for (element in array){
    when (element){
        element is String -> println("String")
        element is Int -> println("Int")
        element is Double -> println("Double")
        element is String -> println("Boolean")
        else -> println("other")
    }
}

 */