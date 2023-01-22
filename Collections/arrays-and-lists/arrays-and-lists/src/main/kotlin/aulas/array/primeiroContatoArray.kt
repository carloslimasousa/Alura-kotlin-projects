package aulas.array

fun testandoIdades() {
    val idades = intArrayOf(25, 19, 33, 20, 55)

    //        var maiorIdade = idades[0]
    //
    //        idades.forEach { idade ->
    //            if(idade > maiorIdade){
    //                maiorIdade = idade
    //            }
    //        }

    //        val maiorIdade = idades.let { idades ->
    //            var maior = 0
    //            idades.forEach { idade ->
    //                if (idade > maior) {
    //                    maior = idade
    //                }
    //            }
    //            maior
    //        }

    val maiorIdade = idades.max()

    val menorIdade = idades.min()

    print(maiorIdade)
    print(menorIdade)
}
