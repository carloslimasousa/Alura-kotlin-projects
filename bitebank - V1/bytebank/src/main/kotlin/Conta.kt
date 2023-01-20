class Conta(
    var titular: String,
    var numero: Int,
    var saldo: Double = 0.0
){

    fun showInfo() = "Titular: $titular \t" +
                "Conta: $numero \t" +
                "Saldo: $saldo \t"

    fun depositar(valor: Double) {
        println("Realizando deposito de R$$valor")
        saldo += valor
    }

    fun sacar(valor: Double): Boolean {
        println("Realizando saque de R$$valor")
        if (saldo >= valor){
            saldo -= valor
            return true
        }
        return false
    }

    fun tranfere(valor: Double, conta: Conta){
        if(sacar(valor)){
            conta.depositar(valor)
            println("Transferecia feita com sucesso")
        } else {
            println("Não foi possivel fazer a transferencia")
        }

    }
}