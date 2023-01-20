import funcs.Funcionario

class CalculaBonus {

    var total = 0.0
        private set

    fun registrar(funcionario: Funcionario) {
        total = funcionario.bonificacao()
    }
}