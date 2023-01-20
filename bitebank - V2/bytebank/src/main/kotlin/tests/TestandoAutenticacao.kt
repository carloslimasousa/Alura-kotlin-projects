package tests

import SistemaInterno
import clien.Cliente
import funcs.Diretor
import funcs.Gerente

fun testandoAutenticacao() {
    val cliente = Cliente(
        "Carlos cliente",
        "500.500.500-50",
        "Senha123Cliente"
    )

    val gerente = Gerente(
        "Carlos Gerente",
        "100.100.100-10",
        1000.0,
        "Senha123Gerente"
    )

    val diretor = Diretor(
        "Carlos Diretor",
        "200.200.200-20",
        1000.0,
        "Senha123Diretor",
        100.0
    )

    val sistemaInterno = SistemaInterno()

    println("=== Senhas corretas ===")
    sistemaInterno.entrar(cliente, "Senha123Cliente")
    sistemaInterno.entrar(gerente, "Senha123Gerente")
    sistemaInterno.entrar(diretor, "Senha123Diretor")

    println("=== Senhas incorretas ===")
    sistemaInterno.entrar(cliente, "Senha")
    sistemaInterno.entrar(gerente, "Senha")
    sistemaInterno.entrar(diretor, "Senha")
}