package testes

fun testandoMap() {
    val mapa = mapOf<Int, Double>(1 to 10.0, 2 to 20.0)
    // quando utilizamos o ifix 1 to 10.0 tem mais problemas de performance
    // pair é mais utilizado

    // Quando pegamos ele atraves do indice, ele retornar apenas o valor que está naquela posição
    println("Posição 3 ${mapa[2]}")

    // ja quando pegamos o valor de mapa em ci, e queremos percorrer no For, podemos perceber que conseguimos tanto resgatar
    // o valor quanto o id dele, assim pegando dois valores vinculados.
    for(iten in mapa){
        println("Chave: " + iten.key)
        println("Valor: " + iten.value)
    }
}