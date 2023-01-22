package aulas.list

import aulas.list.entidades.Livro

fun testandoLivros() {
    val livro01 = Livro(
        titulo = "O livro 01",
        autor = "Autor do livro 01",
        anoPublicado = 1991,
        editora = "Editora Generica"
    )

    val livro02 = Livro(
        titulo = "O livro 02",
        autor = "Autor do livro 02",
        anoPublicado = 1992,
        editora = "Editora Generica"
    )

    val livro03 = Livro(
        titulo = "O livro 03",
        autor = "Autor do livro 03",
        anoPublicado = 1993,
        editora = "Editora Generica"
    )

    val livro04 = Livro(
        titulo = "O livro 04",
        autor = "Autor do livro 04",
        anoPublicado = 1994,
        editora = null
    )

    val livros = mutableListOf<Livro>(livro01, livro02, livro03, livro04)

    val livro05 = Livro(
        titulo = "O livro 05",
        autor = "Autor do livro 05",
        anoPublicado = 1995,
        editora = null
    )

    livros.add(livro05)
    println("\nLivros lista completa: \n" + livros.imprimeFormatado())

    livros.remove(livro05)
    println("\nLivros removendo o primeiro: \n" + livros.imprimeFormatado())

    val livrosOrdenados: List<Livro> = livros.sorted()
    println("\nLivros em ordem: \n" + livrosOrdenados.imprimeFormatado())


    // Outro tipo de ordenação
    val ordenandoPorTitulo = livros.sortedBy { it.titulo }
    println("\nLivros em ordem do titulo: \n" + ordenandoPorTitulo.imprimeFormatado())

    // Tambem podemos fazer alguns filtros assima como lista de outros tipos
    val listaFiltrada = livros.filter { it.editora != null}
    println("\nLivros que tem editora: \n" + ordenandoPorTitulo.imprimeFormatado())

    // E tambem podemos tranformar uma lista em outra lista, mudando seu valores ou apenas pegando parte deles
    val ListaDeTitulos = livros.map {it.titulo}
    println("\nImprime lista de titulos mapeada: \n$ListaDeTitulos")

    // um outro jeito de criar listas só que agrupado por um valor
    val groupbyEditora: Map<String?, List<Livro>> = livros.groupBy { it.editora ?: "Desconhecida" }
    println("\nGrupo de livros:")
    groupbyEditora.forEach{ (editora: String?, livros: List<Livro>) ->
        print("Editora: $editora \n" +
                "Books: ${livros.joinToString { it.titulo + "\n" }}")
    }
}

fun List<Livro>.imprimeFormatado() =
    this.joinToString(separator = "\n") {
        " - ${it.titulo} \nby: ${it.autor}" +
                "\npublished by: ${it.editora?: "Desconhecida"}" +
                "\n============================================="
    }