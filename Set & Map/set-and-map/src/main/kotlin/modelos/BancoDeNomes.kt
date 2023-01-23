package modelos

class BancoDeNomes() {
    // Essa variavel vai ser utilizada para ser o valor visivel, como sendo Collection, não tem o metodo add
    // Assim nem um que chame o resultado dessa classe pode sair alterando esse valor
    val nomes: Collection<String> get() = dados.toList() // O toList cria uma proteção extra porque ele cria um copia o valor e não envia a instancia de dados, assim não permitando a modificação

    fun salva(newName: String) {
        dados.add(newName)
    }

    companion object {
        private val dados: MutableList<String> = mutableListOf()
    }
}
