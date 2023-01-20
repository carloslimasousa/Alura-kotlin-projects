package tests

import conts.Conta
import conts.ContaCorrente
import conts.ContaPoupanca

fun testandoContas() {
    val conta01 = ContaCorrente("Henrique", 111)
    val conta02 = ContaPoupanca("Carlos", 112)

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
