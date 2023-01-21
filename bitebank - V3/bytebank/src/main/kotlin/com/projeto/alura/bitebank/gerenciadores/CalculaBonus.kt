package com.projeto.alura.bitebank.gerenciadores

import com.projeto.alura.bitebank.modelo.Funcionario

class CalculaBonus {

    var total = 0.0
        private set

    fun registrar(funcionario: Funcionario) {
        total = funcionario.bonificacao()
    }
}