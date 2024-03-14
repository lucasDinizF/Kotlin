package Conversao


class main{
    var N: Int = 0
    var X: Int = 0
    var MeQ: Double = 0.0
    var PQ: Double = 0.0
    var CQ: Double = 0.0
    var MiQ: Double = 0.0
    var A: Double = 0.0


    constructor(MeQ: Double, PQ: Double, CQ: Double, MiQ: Double, A: Double, N: Int, X: Int){
        this.MeQ = MeQ
        this.PQ = PQ
        this.CQ = CQ
        this.MiQ = MiQ
        this.A = A
        this.N = N
        this.X = X

    }


}

fun ConversaoUnidadesArea(MeQ: Double, CQ: Double, PQ: Double, MiQ: Double, A: Double): Unit{
    var PQ = PQ
    var MeQ = MeQ
    var CQ = CQ
    var A = A
    var MiQ = MiQ

    while(true) {
        print("Valor de N: ")
        var N = readln().toInt()
        print("Valor de X: ")
        var X = readln().toInt()


        if ((N == 1) and (X == 1)) {
            PQ = MeQ * 10.76

            println("Valor de Pe Quadrado: $PQ")


        } else if ((N == 2) and (X == 1)) {
            CQ = PQ * 929

            println("Valor de Centimetro Quadrado: $CQ")

        } else if ((N == 3) and (X == 1)) {
            A = MiQ * 640

            println("Valor de Acre: $A")

        } else if ((N == 4) and (X == 1)) {
            PQ = A * 43560

            println("Valor de Pe Quadrado: $PQ")

        }

        if ((N == 1) and (X == 2)){
            MeQ = PQ/10.76

            println("Valor de Metro Quadrado: $MeQ")

        }else if ((N == 2) and (X == 2)){
            PQ = CQ/929

            println("Valor de Pe Quadrado: $PQ")

        }else if ((N == 3) and (X == 2)){
            MiQ = A/640

            println("Valor de Milha Quadrada: $MiQ")

        }else if ((N == 4) and (X == 2)){
            A = PQ/43560

            println("Valor de Acre: $A")

        }

        if ((N == 0) and (X == 0)){
            break;

        }

    }



}


fun main() {

    print("Valor do Metro Quadrado: ")
    var MeQ = readln().toDouble()
    print("Valor do Pe Quadrado: ")
    var PQ = readln().toDouble()
    print("Valor do Centimetro Quadrado: ")
    var CQ = readln().toDouble()
    print("Valor da Milha Quadrada: ")
    var MiQ = readln().toDouble()
    print("Valor do Acre: ")
    var A = readln().toDouble()



    ConversaoUnidadesArea(MeQ, CQ, PQ, MiQ, A)


}