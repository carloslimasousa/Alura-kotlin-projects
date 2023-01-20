package conts

class ContaCorrente(
    titular: String,
    numero: Int
): Conta(
    titular,
    numero
) {

    override fun sacar(valor: Double): Boolean {
        println("Realizando saque de R$$valor")
        if (saldo >= valor){
            saldo -= valor
            return true
        }
        return false
    }


}