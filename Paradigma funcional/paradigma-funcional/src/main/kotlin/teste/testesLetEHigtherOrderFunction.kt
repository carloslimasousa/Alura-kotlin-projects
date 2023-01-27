package teste

import estudo.independente.modelos.Usuario

fun testeLet() {
    // Codigo comum
    val usuario = Usuario("Carlos", "12345")
    val stringUsuarioInformacoes = "Nome: ${usuario.nome} & Senha: ${usuario.senha}"
    print(stringUsuarioInformacoes)

    //Codigo utilizando let em cadeia
    Usuario("Carlos", "Senha123")
        .let { usuario ->
            "Nome: ${usuario.nome} & Senha: ${usuario.senha}"
        }.let {stringUsuarioInformacoes ->
            println(stringUsuarioInformacoes)
        }

    // Codigo utilizando let em cadeia V2
    Usuario("Carlos", "Senha123")
        .let { usuario ->
            "Nome: ${usuario.nome} & Senha: ${usuario.senha}"
        }.let(::println)
}

fun testeHigth() {
    soma(10, 10) {
        println(it)
    }
}

fun soma(n1: Int, n2: Int, printSoma: (Int) -> Unit) {
    println("Iniciando a soma")
    printSoma(n1 + n2)
    println("Soma Finalizada")
}