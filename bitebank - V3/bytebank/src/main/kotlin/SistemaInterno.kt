import funcs.Gerente

class SistemaInterno {

    fun entrar(gerente: Autenticacao, senha: String) {
        if (gerente.autenticar(senha)){
            println("Bem vindo ao sistema")
        } else {
            println("Falha na authenticação")
        }
    }
}