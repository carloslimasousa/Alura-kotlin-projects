package funcs

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String,
    val plr: Double
) : FuncionarioAdm(
    nome,
    cpf,
    salario,
    senha
) {
    override fun showInfo() = "Funcionario: \n" +
            "Nome: $nome \n" +
            "cpf: $cpf \n" +
            "salario: $salario \n" +
            "plr: $plr \n"

    override fun bonificacao() = salario + plr
}