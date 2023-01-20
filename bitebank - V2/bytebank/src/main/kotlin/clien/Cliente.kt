package clien

import Autenticacao

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: String
): Autenticacao