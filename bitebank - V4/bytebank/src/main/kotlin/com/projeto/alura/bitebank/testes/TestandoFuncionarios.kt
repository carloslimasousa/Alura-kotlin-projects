package com.projeto.alura.bitebank.testes

import com.projeto.alura.bitebank.gerenciadores.CalculaBonus
import com.projeto.alura.bitebank.modelo.Analista
import com.projeto.alura.bitebank.modelo.Diretor
import com.projeto.alura.bitebank.modelo.Gerente

fun testandoFuncionarios() {
    val funcionario = Analista(
        nome = "CarlosF",
        cpf = "500.500.500-10",
        salario = 100.0
    )
    println(funcionario.showInfo())
    println("A bonificação é: " + funcionario.bonificacao())

    val gerente = Gerente(
        nome = "CarlosG",
        cpf = "500.500.500-20",
        salario = 1000.0,
        senha = "12345"
    )
    println(gerente.showInfo())
    println("A bonificação é: " + gerente.bonificacao())

    val diretor = Diretor(
        nome = "CarlosD",
        cpf = "500.500.500-30",
        salario = 10000.0,
        senha = "56789",
        plr = 1000.0
    )
    println(diretor.showInfo())
    println("A bonificação é: " + diretor.bonificacao())

    val calculaBonus = CalculaBonus()

    calculaBonus.registrar(funcionario)
    calculaBonus.registrar(gerente)
    calculaBonus.registrar(diretor)
    println("Total de bonus" + calculaBonus.total)
}