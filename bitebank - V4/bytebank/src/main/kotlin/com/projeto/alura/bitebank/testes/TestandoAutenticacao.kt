package com.projeto.alura.bitebank.testes

import com.projeto.alura.bitebank.gerenciadores.SistemaInterno
import com.projeto.alura.bitebank.modelo.Cliente
import com.projeto.alura.bitebank.modelo.Diretor
import com.projeto.alura.bitebank.modelo.Endereco
import com.projeto.alura.bitebank.modelo.Gerente
import com.projeto.alura.bitebank.modelo.exception.FalhaAutenticacao

fun testandoAutenticacao() {
    val cliente = Cliente(
        nome = "Carlos 01",
        cpf = "100.100.100-10",
        senha = "123",
        endereco = Endereco(
            "Rua da casa",
            90,
            "Bairo de barro",
            "Cidade ade",
            "Estado ado",
            "04040-100",
            "Casa do lado da casa"
        )
    )

    val gerente = Gerente(
        "Carlos Gerente",
        "100.100.100-10",
        1000.0,
        "Senha123Gerente"
    )

    val diretor = Diretor(
        "Carlos Diretor",
        "200.200.200-20",
        1000.0,
        "Senha123Diretor",
        100.0
    )

    val sistemaInterno = SistemaInterno()

    println("=== Senhas corretas ===")
    sistemaInterno.entrar(cliente, "Senha123Cliente")
    sistemaInterno.entrar(gerente, "Senha123Gerente")
    sistemaInterno.entrar(diretor, "Senha123Diretor")

    println("=== Senhas incorretas ===")
    try {
        sistemaInterno.entrar(cliente, "Senha")
    } catch (e: FalhaAutenticacao){
        print("Falha em autenticar sua senha")
    }
    try {
        sistemaInterno.entrar(gerente, "Senha")
    } catch (e: FalhaAutenticacao){
        print("Falha em autenticar sua senha")
    }
    try {
        sistemaInterno.entrar(diretor, "Senha")
    } catch (e: FalhaAutenticacao){
        print("Falha em autenticar sua senha")
    }
}