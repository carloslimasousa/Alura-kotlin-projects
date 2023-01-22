package aulas.array

private fun testeEachIndexed() {
    val salarios: DoubleArray = doubleArrayOf(1500.0, 3200.0, 4000.0, 124200.0)

    //        val aumento = 1.1
    //        for(i in salarios.indices){
    //            salarios[i] *= aumento
    //        }

    val aumento = 1.1
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
}