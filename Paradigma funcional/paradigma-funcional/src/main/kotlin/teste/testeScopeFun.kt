package teste

import estudo.independente.modelos.Usuario

fun testeWith() {
    val valorToString = with(Usuario(nome = "Carlos", senha = "Senha")){
        nome = "Henrique"
        toString()
    }.also {
        println(it)
    }
}

fun testeRun() {
    Usuario(nome = "Carlos", senha = "Senha").let { usuario ->
        println(usuario.toString())
        usuario.run {
            adicionarValor(1000.0)
            valor * 0.1
        }.let {valorAumento ->
            println("Valor aumento: $valorAumento")
        }
    }
}