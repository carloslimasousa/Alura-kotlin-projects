package estudo.independente.testes

import estudo.independente.modelos.Usuario

fun testesFuncoes() {

    // esse codigo apesar de fazer a altera não atende o que é adotado no paradigma funcional
    // Já que a ideia é que a função não consiga alterar ou consultar variaveis externas
    val user1 = Usuario("Carlos", "1234")
    println("original: ${user1.nome}")

    val lambdaTentandoAlterar: (String) -> Unit = { novoNome ->
        user1.nome = novoNome
    }

    lambdaTentandoAlterar("Henrique")

    println("original pós alteração: ${user1.nome}")
    println("===========================================")

    // Para seguir o paradigma funcionar o correto seria algo assim
    val user2 = Usuario("Carlos", "1234")
    println("original: ${user2.nome}")

    val lambdaAlterandoCorretamente: (Usuario, String) -> Usuario = { usuario, novoNome ->
        usuario.copy(nome=novoNome)
    }

    val usuarioAlterado = lambdaAlterandoCorretamente(user2, "Henrique")

    println("original pós alteração: ${user2.nome}")
    println("Objeto secundario gerado pela lambda: ${usuarioAlterado.nome}")

}