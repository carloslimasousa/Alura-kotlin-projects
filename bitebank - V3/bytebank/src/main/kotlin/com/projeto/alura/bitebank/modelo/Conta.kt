package com.projeto.alura.bitebank.modelo

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

    abstract fun sacar(valor: Double): Boolean

    fun tranfere(valor: Double, conta: Conta){
        if(sacar(valor)){
            conta.depositar(valor)
            println("Transferecia feita com sucesso")
        } else {
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

    override fun sacar(valor: Double): Boolean {
        println("Realizando saque de R$$valor")
        if (saldo >= valor){
            saldo -= valor
            return true
        }
        return false
    }

}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double): Boolean {
        println("Realizando saque de R$$valor com taxa de ${valor * 0.1}")
        if (saldo >= valor * 0.1){
            saldo -= valor * 0.1
            return true
        }
        return false
    }
}