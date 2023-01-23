package testes

import modelos.Pedido

fun testandoAgrupamento() {
    val pedidos = listOf<Pedido>(
        Pedido(1, 10.0),
        Pedido(2, 20.0),
        Pedido(3, 30.0),
        Pedido(4, 40.0),
        Pedido(5, 50.0),
    )
    println(pedidos)

    // Mapeando um objeto em um pair, que basicamente voce consegue associar um valor dele como sua chave
    // Mas com isso ele não consegue ter o agrupamento correto e sim sobrescrever o valor
    val pedidosAgrupadosErrado: Map<Boolean, Pedido> = pedidos.associateBy { pedido -> pedido.valor > 40 }
    println(pedidosAgrupadosErrado)

    // Já com o group by ele consegue ter esse comportamento e agrupar valores em uma chave só
    val pedidosAgrupados = pedidos.groupBy { pedido -> pedido.valor > 40 }
    println(pedidosAgrupados)

}