package conts

abstract class Conta(
    var titular: String,
    var numero: Int,

){
    var saldo: Double = 0.0
        protected set

    fun showInfo() = "Titular: $titular \t" +
                "conts.Conta: $numero \t" +
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