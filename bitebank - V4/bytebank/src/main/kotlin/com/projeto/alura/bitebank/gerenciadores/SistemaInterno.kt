package com.projeto.alura.bitebank.gerenciadores

import com.projeto.alura.bitebank.modelo.exception.FalhaAutenticacao
import com.projeto.alura.bitebank.modelo.interfaces.Autenticacao

class SistemaInterno {

    fun entrar(gerente: Autenticacao, senha: String) {
        if (gerente.autenticar(senha)){
            println("Bem vindo ao sistema")
        } else {
            throw FalhaAutenticacao("A autenticação falhou").also{
                println("A autenticação falhou")
            }
        }
    }
}