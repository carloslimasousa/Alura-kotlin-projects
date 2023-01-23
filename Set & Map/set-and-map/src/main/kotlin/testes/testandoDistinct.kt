package testes

fun testandoDistinct() {
    val assistiramCurso1 = listOf("Carlos", "Henrique", "Julia", "Ana")
    val assistiramCurso2 = listOf("Carlos", "Henrique", "Julia", "Ana")
    val assistiramAmbos = assistiramCurso1 + assistiramCurso2
    print(assistiramAmbos.distinct())
}