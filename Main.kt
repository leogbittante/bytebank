fun main() {
    println("Bem-vindo ao Bytebank")

    val contaLeonardo = Conta()
    contaLeonardo.titular = "Leonardo"
    contaLeonardo.numero = 1000
    contaLeonardo.setSaldo(1000.0)
    println(contaLeonardo.titular)
    println(contaLeonardo.numero)
    println(contaLeonardo.getSaldo())

    val contaNayara = Conta()
    contaNayara.titular = "Nayara"
    contaNayara.numero = 1001
    contaNayara.setSaldo(5000.0)
    println(contaNayara.titular)
    println(contaNayara.numero)
    println(contaNayara.getSaldo())

    /*
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

    if(contaLeonardo.transfere(100.0, contaNayara)) {
        println("Transferência bem sucedida")
    } else {
        println("Falha na transferencia")
    }
    println(contaNayara.saldo)
    println(contaLeonardo.saldo)

    */
}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    fun getSaldo(): Double  {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if(valor > 0) {
            saldo = valor
        }
    }
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Leonardo $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
        i++
    }

    for (i in 6 downTo 1 step 2) {

        val titular: String = "Leonardo $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}