package funcs

class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(
    nome,
    cpf,
    salario
) {
    override fun bonificacao(): Double {
        return salario + (salario * 0.1 * 0.5)
    }
}