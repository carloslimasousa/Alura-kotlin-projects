package testes

fun testandoSetV2() {
    val assistiramCurso1 = setOf("Carlos", "Henrique", "Julia", "Ana", "Claudia")
    val assistiramCurso2 = setOf("Carlos", "Henrique", "Julia", "Ana")
    // Uma das caracteristicas do set é que ele não repete elementos, ou seja, quando tentarmos adicionar o mesmo
    // Elemento a uma lista de set, ele não vai adicionar e ignorar a implementação
    val assistiramAmbos: Set<String> = assistiramCurso1 + assistiramCurso2
    println(assistiramAmbos)

    // Mesmo comportamento do "+", só que é um metodo do proprio set e não generico
    println(assistiramCurso1 union assistiramCurso2)

    // assim como da para somar ele pode subtrair valores usando subtract ou o -
    println(assistiramCurso1 subtract assistiramCurso2)

    // Agora para podermos comparar dois valores e mostrar apenas o que se repetem nas duas listas temos o intersect
    println(assistiramCurso1 intersect assistiramCurso2)

    // Ele tambem permite copy como toList, assim podendo tranformar e criar novas instancias diferentes do objeto
    print(assistiramAmbos.toList())
}