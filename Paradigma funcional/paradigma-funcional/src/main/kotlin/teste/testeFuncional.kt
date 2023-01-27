package teste

fun testeSoma() {
    // A assinatura do metodo deve ser compativel com a função que essa variavel recebe, então se eu recebo
    // Dois Int e retorno um Boolean, o metodo que pode ser compativel com essa variavel deve ter a mesma assinatura
    val minhaFuncao: (String, String) -> String
}

fun test(v1: String, v2: String): String {
    return "Estou testando"
}

