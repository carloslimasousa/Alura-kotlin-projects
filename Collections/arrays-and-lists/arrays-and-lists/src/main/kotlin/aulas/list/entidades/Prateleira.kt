package aulas.list.entidades

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {
    fun ordenarPorTitulo(): List<Livro> {
        return this.livros.sortedBy { it.titulo }
    }

    fun ordernarPorAno(): List<Livro>{
        return this.livros.sortedBy { it.anoPublicado }
    }
}
