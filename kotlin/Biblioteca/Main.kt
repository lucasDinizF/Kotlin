package Biblioteca

class Livro {

    var T: String = ""
    var A: String = ""
    var P: String = ""


    constructor(T: String, A: String, P:String){
        this.T = T
        this.A = A
        this.P = P

    }

}

class biblioteca() {
    var Biblioteca = ArrayList<Livro>()
    var E: String = ""
    var CD: Int = 0
    var CE: Int = 0


    fun add(L: Livro, E:String){
        Biblioteca.add(L)
        this.E = E;

    }

    fun Search(L: Livro): Boolean{

        if (equals(E, "Disponivel")) {
            return Biblioteca.contains(L)

        }

        else{
            return false

        }

    }

    fun QuantidadeE(): Int{
        if (equals(E, "Emprestado")){
            CE++

        }

        return CE
    }

    fun QuantidadeD(): Int{
        if (equals(E, "Disponivel")){
            CD++

        }
        return CD;
    }

    private fun equals(other: String, s: String): Boolean {
        if (other == s){
            return true

        }

        else{
            return false

        }

    }

    fun Quantidade(): Int{
        var count: Int = 0

        for (i in 1 .. Biblioteca.size){
            count++


        }

        return count;
    }

}

fun main(){
    var livro1 = Livro("Maus", "Art Spiegelman", "296")

    var livro2 = Livro("O senhor dos aneis", " J. R. R. Tolkien", "1211")

    var livro3 = Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", "208")

    var biblio = biblioteca()

    biblio.add(livro1, "Disponivel")

    biblio.QuantidadeE()
    biblio.QuantidadeD()

    biblio.add(livro2, "Devolver")

    biblio.QuantidadeE()
    biblio.QuantidadeD()

    biblio.add(livro3,"Emprestado")

    println(biblio.Search(livro3))

    println("Temos ${biblio.Quantidade()} livros")

    println("Temos ${biblio.QuantidadeE()} Emprestado(s)")

    println("Temos ${biblio.QuantidadeD()} Disponivel(s)")
}