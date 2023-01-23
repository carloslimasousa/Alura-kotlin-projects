package testes

import modelos.BancoDeNomes

fun tenteBancoDeNomes() {
    val bancoDeNomes = BancoDeNomes()
    bancoDeNomes.salva("Carlos")

    print(bancoDeNomes.nomes)
}