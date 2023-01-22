package aulas.array

fun testeIdadesOperacaoAgregadores() {
    val idades: IntArray = intArrayOf(10, 12, 19, 33, 40, 67)
    val maiorIdade = idades.max()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val medias = idades.average()
    println("Media de idade: $medias")

    val todosMaiores = idades.all {it >= 18}
    println("Todos maiores: $todosMaiores")

    val existeMaior = idades.any { it >= 18}
    println("Existe alguma idade maior: $existeMaior")

    val maioresDeIdade = idades.filter { it >= 18 }
    println("Lista de maiores: $maioresDeIdade")

    val menoresDeIdade = idades.filter { it < 18 }
    println("Lista de menores: $menoresDeIdade")
    
    val findMaiorDeIdade = idades.find { it >= 18 }
    println("Buscar o primeiro que é maior de idade da lista: $findMaiorDeIdade")

}