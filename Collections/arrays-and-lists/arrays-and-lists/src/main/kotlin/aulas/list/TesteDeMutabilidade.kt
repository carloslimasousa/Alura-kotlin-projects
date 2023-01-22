package aulas.list

import aulas.list.entidades.Livro
import aulas.list.entidades.Prateleira

fun testeMutabilidade() {
    val livro01 = Livro(
        titulo = "O livro 01",
        autor = "Autor do livro 01",
        anoPublicado = 1991,
        editora = "Editora Generica"
    )

    val livro02 = Livro(
        titulo = "O livro 02",
        autor = "Autor do livro 02",
        anoPublicado = 1800,
        editora = null
    )

    val prateleira = Prateleira("Ação", mutableListOf())

    prateleira.livros.add(
        livro01
    )
    prateleira.livros.add(
        livro02
    )

    println("Ordernar por ano" + prateleira.ordernarPorAno().imprimeFormatado())
    println("Ordernar por titulo" + prateleira.ordenarPorTitulo().imprimeFormatado())
}