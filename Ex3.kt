import androidx.core.util.rangeTo

fun main() {
    /* Q1 */
    for (i in 0..100) {
        if (i >= 71) {
            println("Its over 70!!!")
        } else {
            println(i)
        }
    }
 /* Q2 */
    var temp=35
    while (temp >10){
        when (temp) {
            30 -> println("It's Hot")
            20 -> println("Its Comfy")
            15 -> println("its COLD")
            else -> println(temp)
        }
        temp-=1
    }
}