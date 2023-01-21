package com.projeto.alura.bitebank.modelo

class Endereco(
    val logradouro: String,
    val numero: Int,
    val bairro: String,
    val cidade: String,
    val estado: String,
    val cep: String,
    val complemento: String,
) {
    fun showInfo() = "Logradouro: $logradouro \t" +
            "numero: $numero \t" +
            "bairro: $bairro \t" +
            "cidade: $cidade \t" +
            "estado: $estado \t" +
            "cep: $cep \t" +
            "complemento: $complemento \t"
}