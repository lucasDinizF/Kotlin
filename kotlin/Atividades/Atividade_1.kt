package Atividades
import kotlin.random.Random

fun main(){

    var conP: Int = 0
    var conI: Int = 0

    for (i in 1.. 10) {
        var N = Random.nextInt(1, 51)
        println(N)

        if (N % 2 == 0)
            conP++

        else
            conI++
    }

    println(conP)
    println(conI)
}