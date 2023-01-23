package testes

fun testandoMapV2() {
    val pedidos = mutableMapOf<Int, Double>(1 to 10.0, 2 to 20.0)
    print("Lista inicial $pedidos")

    // Adicionando usando []
    pedidos[4] = 32.0
    print("Adicionando pedidos com a key 4 $pedidos")

    // addicionando usanod os metodos do map put
    pedidos.put(5, 50.0)
    pedidos[2] = 20.2 // Adendo e que quando usamos a adição, se caso a chave ja estiver em uso o valor e alterado

    print("Adicionando mais dois pedidos $pedidos")
    // Adicionando caso ele não exista
    pedidos.putIfAbsent(2, 22.2)
    print("Adicionando ja existente usando absent $pedidos")

    // removendo com metodos do map
    pedidos.remove(key = 2)
    print("removendo o pedido 2 $pedidos")
}