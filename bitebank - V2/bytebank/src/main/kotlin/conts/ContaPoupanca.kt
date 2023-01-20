package conts

class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double): Boolean {
        println("Realizando saque de R$$valor com taxa de ${valor * 0.1}")
        if (saldo >= valor * 0.1){
            saldo -= valor * 0.1
            return true
        }
        return false
    }
}