package com.projeto.alura.bitebank.modelo

import com.projeto.alura.bitebank.modelo.interfaces.Autenticacao

abstract class FuncionarioAdm(
    nome: String,
    cpf: String,
    salario: Double,
    override val senha: String
): Autenticacao, Funcionario(
    nome,
    cpf,
    salario
)