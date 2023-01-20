package funcs

import Autenticacao

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