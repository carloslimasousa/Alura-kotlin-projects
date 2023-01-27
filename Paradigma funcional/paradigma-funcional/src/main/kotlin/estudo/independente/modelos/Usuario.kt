package estudo.independente.modelos

data class Usuario(
    var nome: String,
    var senha: String,
    var valor: Double = 0.0,
) {
    fun adicionarValor(valor: Double) {
        this.valor += valor
    }
}