package aulas.array

import java.math.BigDecimal
import java.math.RoundingMode

fun testeArrayDeObjetos() {
    val salario = bigDecimalArrayOf("1500.0", "2000.0", "50000.0", "1000000.0")

    println(salario.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salarioComAumento = salario.map {
        if (it < "500".toBigDecimal()) {
            it + "500".toBigDecimal()
        } else {
            // Com o setScale podemos fazer um aredondamento, com duas casas decimais e arredondandomento pra cima (como definido)
            it * aumento.setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()

    println("Salarios com ajuste: $salarioComAumento")

    val gastoMensalAjuste = salario.somatoria()
    println("Valor mensal depois do ajuste: $gastoMensalAjuste")

    val meses = 6.toBigDecimal()
    val gastoTotal = salarioComAumento.fold(gastoMensalAjuste) {
        acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gastos totais: $gastoTotal")

    // Ordena a lista
    val salariosOdenados = salarioComAumento.sorted()
    // pega o ultimo salario, no caso colocando o 3 como paramentro indica os 3 ultimos
    val tresUltimosSalarios: Array<BigDecimal> = salariosOdenados.takeLast(3).toTypedArray()
    println("Ultimos 3 valores: $tresUltimosSalarios")
    println("Media dos 3 ultimos valores: ${tresUltimosSalarios.media()}")
}


// Cria uma função que permite criar arrays de bigdecimal
// a variavel do tipo vararg cria um array flexivel do tipo que for definido na variavel, assim podendo ser apenas um valor ou um array
// A função converte um array de string em um array de bigdecimal
fun bigDecimalArrayOf(vararg valores: String) = Array<BigDecimal>(valores.size) {
    valores[it].toBigDecimal()
}

// Um modo mais simple ser transformado
// fun bigDecimalArrayOf(vararg valores: String) = valores.map { it.toBigDecimal() }

fun Array<BigDecimal>.somatoria() =
    // ele funciona como um acumulador, ou somador, basicamente podemos colocar o valor e ir calculando com o acumulador que é o retorno do ultimo resultado
    this.reduce { acumulador, valor ->
        acumulador + valor
    }


fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()){
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}
