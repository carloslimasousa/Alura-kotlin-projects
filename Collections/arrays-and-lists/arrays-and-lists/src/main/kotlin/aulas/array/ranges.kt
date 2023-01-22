package aulas.array

fun testeRages() {
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        print("$s ")
    }
    println()

    val numerosPares = 0..100 step 2
    // Assim desconsideramos o ultimo numero
    // val numerosPares = 0.until(100) step 2
    for(numP in numerosPares){
        print("$numP ")
    }
    println()

    val numerosParesInvertidos = 100 downTo 0 step 2
    numerosParesInvertidos.forEach {numero ->
        print("$numero ")
    }
    println()

    val intervalo = 1500..5000
    val salario = 2000
    if(salario in intervalo){
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }

    val intervaloAlfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in intervaloAlfabeto)
}