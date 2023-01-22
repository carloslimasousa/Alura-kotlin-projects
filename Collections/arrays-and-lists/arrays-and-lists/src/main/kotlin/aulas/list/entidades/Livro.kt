package aulas.list.entidades

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicado: Long,
    val editora: String? = null,
): Comparable<Livro> {

    // Essa implementação em conjunto com a classe comparable serve para que ele tenha um ponto de referencia
    // Quando tentar fazer alguma ordenação, ele vai utilizar essa comparação para entender quem dever ficar em quala posição
    override fun compareTo(other: Livro): Int {
        return this.anoPublicado.compareTo(other.anoPublicado)
    }
}