package Atividades

class Atividade_3 {
    var N: String = ""
    var I: String = ""
    var P: String = ""

    constructor(N: String, I: String, P: String){
        this.N = N
        this.I = I
        this.P = P
    }
}

fun pessoa(N: String, I: String, P: String): Unit{
    println(N)
    println(I)
    println(P)
    println(" ")

}

fun main(){
    var pessoa_1 = pessoa("Lucas Diniz Frota", "20", "Programador")
    var pessoa_2 = pessoa("Pedro Vasconcelos Mendes", "26", "Medico")
    var pessoa_3 = pessoa("Lia Ferreira Gomes", "30", "Arquiteta")

}