package com.projeto.alura.bitebank.gerenciadores

import com.projeto.alura.bitebank.modelo.interfaces.Autenticacao

class SistemaInterno {

    fun entrar(gerente: Autenticacao, senha: String) {
        if (gerente.autenticar(senha)){
            println("Bem vindo ao sistema")
        } else {
            println("Falha na authenticação")
        }
    }
}