package testes

import modelos.Pedido

fun testandoAssociacao() {
    val pedidos = listOf<Pedido>(
        Pedido(1, 10.0),
        Pedido(2, 20.0),
        Pedido(3, 30.0),
        Pedido(4, 40.0),
        Pedido(5, 50.0),
    )

    println(pedidos)

//    // Mapeando um objeto em um pair, que basicamente voce consegue associar um valor dele como sua chave
//    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido ->
//        Pair(pedido.numero, pedido)
//    }

    // Mapeando um objeto em um pair, que basicamente voce consegue associar um valor dele como sua chave
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)

    // Com isso voce consegue atrelar um objeto a um valor de resposta, ou seja um objeto x, vai ter true ou false como seu valor
    val pedidosComCodicao = pedidos.associateWith { pedido -> pedido.valor > 40.0 }
    println(pedidosComCodicao)
}