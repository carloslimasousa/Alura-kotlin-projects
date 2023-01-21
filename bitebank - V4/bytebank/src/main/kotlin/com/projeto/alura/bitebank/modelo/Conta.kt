package com.projeto.alura.bitebank.modelo

import com.projeto.alura.bitebank.modelo.exception.SemSaldoException

abstract class Conta(
    var titular: Cliente,
    var numero: Int,
){
    var saldo: Double = 0.0
        protected set

    companion object {
        var total = 0
    }

    init {
        println("Criando uma nova conta")
        total++
    }

    fun showInfo() = titular.showInfo() +
                "Numero da conta: $numero \t" +
                "Saldo: $saldo \t"

    fun depositar(valor: Double) {
        println("Realizando deposito de R$$valor")
        saldo += valor
    }

    abstract fun sacar(valor: Double)

    fun tranfere(valor: Double, conta: Conta){
        try {
            sacar(valor)
            conta.depositar(valor)
        }catch (e: SemSaldoException){
            println("Não foi possivel fazer a transferencia")
        }

    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
): Conta(
    titular,
    numero
) {

    override fun sacar(valor: Double) {
        println("Realizando saque de R$$valor")
        if (saldo >= valor){
            saldo -= valor
        } else {
            throw SemSaldoException("Saldo insuficiente")
        }
    }

}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double) {
        println("Realizando saque de R$$valor com taxa de ${valor * 0.1}")
        if (saldo >= valor * 0.1){
            saldo -= valor * 0.1
        } else {
            throw SemSaldoException("Saldo insuficiente")
        }
    }
}