package testes

fun testandoSet() {
    val assistiramCurso1 = setOf("Carlos", "Henrique", "Julia", "Ana")
    val assistiramCurso2 = setOf("Carlos", "Henrique", "Julia", "Ana")
    // Uma das caracteristicas do set é que ele não repete elementos, ou seja, quando tentarmos adicionar o mesmo
    // Elemento a uma lista de set, ele não vai adicionar e ignorar a implementação
    val assistiramAmbos: Set<String> = assistiramCurso1 + assistiramCurso2
    print(assistiramAmbos)

    // Demonstração de uma mutable set, que pode addicionar valores e se caso se repetirem ele será ignorado
//    val assistiramCurso1 = mutableSetOf("Carlos", "Henrique", "Julia", "Ana")
//    val assistiramCurso2 = mutableSetOf("Carlos", "Henrique", "Julia", "Ana")
//    val assistiramAmbos: MutableSet<String> = mutableSetOf()
//    assistiramAmbos.addAll(assistiramCurso1)
//    assistiramAmbos.addAll(assistiramCurso1)
//    assistiramAmbos.add("Carlos")
//    print(assistiramAmbos)
}