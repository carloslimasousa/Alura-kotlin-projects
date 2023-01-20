package tests

import conts.ContaCorrente
import conts.ContaPoupanca

fun testandoContasDiferentes() {
    val contaCorrente = ContaCorrente(
        "Carlos Henrique",
        1100
    )

    val contaPoupanca = ContaPoupanca(
        "Carlos Henrique Lima",
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
}