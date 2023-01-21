package com.projeto.alura.bitebank.testes

import com.projeto.alura.bitebank.modelo.Cliente
import com.projeto.alura.bitebank.modelo.ContaCorrente
import com.projeto.alura.bitebank.modelo.ContaPoupanca
import com.projeto.alura.bitebank.modelo.Endereco

fun testandoContas() {
    val cliente1 = Cliente(
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
    val cliente2 = Cliente(
        nome = "Carlos 02",
        cpf = "200.200.200-20",
        senha = "456",
        endereco = Endereco(
            "Rua da casa 2",
            100,
            "Bairo de barro 2",
            "Cidade ade 2",
            "Estado ado 2",
            "04040-200",
            "Casa do lado da casa 2"
        )
    )

    val conta01 = ContaCorrente(cliente1, 111)
    val conta02 = ContaPoupanca(cliente2, 112)

    println("Titular: ${conta01.titular}")
    println("Numero da conta: ${conta01.numero}")
    println("Saldo da conta: ${conta01.saldo}")

    conta01.depositar(100.0)
    println(conta01.showInfo())
    conta01.sacar(100.0)
    println(conta01.showInfo())
    conta01.depositar(500.0)
    println(conta01.showInfo())
    conta01.tranfere(500.0, conta02)
    println(conta01.showInfo())
    println(conta02.showInfo())
}
