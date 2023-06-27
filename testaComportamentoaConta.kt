fun testaComportamentosConta() {
    val contaLeonardo = Conta("Leonardo", 1000)
    contaLeonardo.deposita(1000.0)

    println(contaLeonardo.titular)
    println(contaLeonardo.numero)
    println(contaLeonardo.saldo)


    val contaNayara = Conta("Nayara", 1001)
    contaNayara.deposita(5000.0)

    println(contaNayara.titular)
    println(contaNayara.numero)
    println(contaNayara.saldo)


    println("Depositando na conta do Leonardo")
    contaLeonardo.deposita(50.0)
    println(contaLeonardo.saldo)

    println("Depositando na conta da Nayara")
    contaNayara.deposita(100.0)
    println(contaNayara.saldo)

    println("Sacando da conta do Leonardo")
    contaLeonardo.saca(100.0)
    println(contaLeonardo.saldo)

    println("Transferencia de Leonardo para Nayara")

    if (contaLeonardo.transfere(100.0, contaNayara)) {
        println("Transferência bem sucedida")
    } else {
        println("Falha na transferencia")
    }
    println(contaNayara.saldo)
    println(contaLeonardo.saldo)
}