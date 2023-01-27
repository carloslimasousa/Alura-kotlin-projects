package estudo.independente.testes

import estudo.independente.modelos.Usuario

fun testeVariaveisFunctionType() {
    // Criando uma estrutura onde indico que o tipo dela vai receber uma função com essa assinatura
    // Em seguinda crio uma execução lambda que seja compativel e assim crio uma execução atrelada
    val lambdaFun: (String, String) -> String = { nome1, nome2 ->
        "$nome1 + $nome2"
    }

    println(lambdaFun.invoke("MeuNome01", "MeuNome2"))


    // A ideia do lamda é criar uma função sem realmente ter a necessidade de definir ela externamente
    // e apenas montar qual é sua assinatura, então assim como a classe object é mais usado em casos
    // que voce que facilitar as escrita do seu codigo em menos linhas, mas se utilzado para um contexto
    // de paradigma funcional existem algumas regras que obrigam que esse cara seja isolado (puro) que significa
    // que ele não deve alterar nada fora do seu bloco de codigo e nem consumir coisas externas, apeas o que for
    // passado para ele.
    val user = Usuario("Carlos", "1234")
    println("original: ${user.nome}")

    val lambdaRetorno: (Usuario) -> Usuario = { usuario ->
        usuario.copy(nome = "Henrique")
    }

    println("original pós alteração: ${user.nome}")
    println("retorno lambda: ${lambdaRetorno.invoke(user).nome}")
}