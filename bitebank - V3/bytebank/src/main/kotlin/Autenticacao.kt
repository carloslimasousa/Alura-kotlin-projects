interface Autenticacao {
    val senha: String

    fun autenticar(senhaT: String): Boolean = senha == this.senha
}