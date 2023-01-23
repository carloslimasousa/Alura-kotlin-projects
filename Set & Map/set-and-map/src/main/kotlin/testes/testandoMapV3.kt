package testes

fun testandoMapV3() {
    val pedidos = mutableMapOf<Int, Double>(1 to 10.0, 2 to 20.0)
    println("Lista inicial $pedidos")

    // Diferenças de pegar o valor com getValue ou com []
    // Com [] se o a chave não existir ele deve soltar um exception
    // Com getValue ele deve trazer o valor com safeCall ou seja apenas o valor null mesmo
//    print(pedidos[100])
//    print(pedidos.getValue(100))

    // Testando get or else, que basicamente valida se o valor não existe e volta um valor default definido
    println(pedidos.getOrDefault(100, {
        "Posso colocar qualquer valor como padrão"
    }))

    // Testando get or defaul que permite que eu apensar consiga voltar um valor do mesmo tipo
    println(pedidos.getOrDefault(100, {
        20.0 // Consigo apenas usar um valor igual o do padrão
    }))
}