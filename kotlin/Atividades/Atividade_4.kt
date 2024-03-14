package Atividades

class Atividade_4 {
    var N: String = ""
    var P: String = ""
    var Q: String = ""

    constructor(N: String, P: String, Q: String){
        this.N = N
        this.P = P
        this.Q = Q

    }
}
fun Produto(N: String, P: String, Q: String): Unit{
    println("Nome: $N")
    println("$P R$")
    println("Temos $Q $N")
    println(" ")

}
fun main(){

    print("Qual o nome: ")
    var Name_1 = readLine()!!
    print("Qual o preço: ")
    var Price_1 = readLine()!!
    print("Qual a quantidade: ")
    var Amount_1 = readLine()!!
    println("")

    var produto_1 = Produto(Name_1, Price_1, Amount_1)

    print("Qual o nome: ")
    var Name_2 = readLine()!!
    print("Qual o preço: ")
    var Price_2 = readLine()!!
    print("Qual a quantidade: ")
    var Amount_2 = readLine()!!
    println("")

    var produto_2 = Produto(Name_2, Price_2, Amount_2)

    print("Qual o nome: ")
    var Name_3 = readLine()!!
    print("Qual o preço: ")
    var Price_3 = readLine()!!
    print("Qual a quantidade: ")
    var Amount_3 = readLine()!!
    println("")

    var produto_3 = Produto(Name_3, Price_3, Amount_3)

}