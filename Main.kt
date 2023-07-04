fun main() {
    println("Bem-vindo ao Bytebank")

    val leo = Funcionario(
        "Leonardo",
        "11.111.111-11",
        1000.0
    )

    println("nome: ${leo.nome}")
    println("cpf: ${leo.cpf}")
    println("salário: ${leo.salario}")
    println("bonificação: ${leo.bonificacao()}")

    val fran = Gerente(
        "Fran",
        "22.222.222-22",
        2000.0,
        senha = 4000,
    )
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salário: ${fran.salario}")
    println("Bonificação ${fran.bonificacao()}")

    if (fran.autentica(4000)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val roberto = Diretor(
        "Roberto",
        "33.333.333-33",
        4000.0,
        1234,
        200.0
    )

    println("nome: ${roberto.nome}")
    println("cpf: ${roberto.cpf}")
    println("salário: ${roberto.salario}")
    println("Bonificação ${roberto.bonificacao()}")
    println("PLR ${roberto.plr}")

    if (roberto.autentica(4000)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val maria = Analista(
        "Maria",
        "444.444.444-44",
        3000.0
    )

    val calculadora = CalculadoraBnoficacao()
    calculadora.registra(leo)
    calculadora.registra(fran)
    calculadora.registra(roberto)
    calculadora.registra(maria)

    println("Total bonificação: ${calculadora.total}")
}





