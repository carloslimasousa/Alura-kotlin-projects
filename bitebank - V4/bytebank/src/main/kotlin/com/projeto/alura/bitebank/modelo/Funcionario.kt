package com.projeto.alura.bitebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double,
) {

    open fun showInfo() = "Funcionario: \n" +
            "Nome: $nome \n" +
            "cpf: $cpf \n" +
            "salario: $salario \n"

    abstract fun bonificacao(): Double
}