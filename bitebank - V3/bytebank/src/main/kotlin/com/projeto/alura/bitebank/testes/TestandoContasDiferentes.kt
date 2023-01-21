package com.projeto.alura.bitebank.testes

import com.projeto.alura.bitebank.modelo.Cliente
import com.projeto.alura.bitebank.modelo.ContaCorrente
import com.projeto.alura.bitebank.modelo.ContaPoupanca
import com.projeto.alura.bitebank.modelo.Endereco

fun testandoContasDiferentes() {

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

    val contaCorrente = ContaCorrente(
        cliente1,
        1100
    )

    val contaPoupanca = ContaPoupanca(
        cliente2,
        1100
    )

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println(contaCorrente.showInfo())
    println(contaPoupanca.showInfo())

    println("==Sacando valores==")
    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println(contaCorrente.showInfo())
    println(contaPoupanca.showInfo())

    println()
}