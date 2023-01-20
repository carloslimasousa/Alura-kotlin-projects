package funcs

open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
): FuncionarioAdm(
    nome,
    cpf,
    salario,
    senha
) {

    override fun bonificacao() = salario + salario * 0.05

}