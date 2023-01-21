package com.projeto.alura.bitebank.modelo

import com.projeto.alura.bitebank.modelo.interfaces.Autenticacao

class Cliente(
    val nome: String,
    val cpf: String,
    val endereco: Endereco,
    override val senha: String
): Autenticacao {
    fun showInfo() = "nome: $nome \n" +
            "nome: $cpf \n" +
            "nome: $endereco \n" +
            endereco.showInfo()

    override fun toString(): String {
        return "Cliente(nome='$nome', cpf='$cpf', endereco=$endereco, senha='$senha')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Cliente

        if (nome != other.nome) return false
        if (cpf != other.cpf) return false
        if (endereco != other.endereco) return false
        if (senha != other.senha) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + cpf.hashCode()
        result = 31 * result + endereco.hashCode()
        result = 31 * result + senha.hashCode()
        return result
    }


}