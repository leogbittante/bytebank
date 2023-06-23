fun main() {
    println("Bem-vindo ao Bytebank")

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

class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
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

    /*    fun getSaldo(): Double  {
            return saldo
        }

        fun setSaldo(valor: Double) {
            if(valor > 0) {
                saldo = valor
            }
        } */
}

fun testaCopiasEReferencias() {
    var numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

//    val contaJoao = Conta()
//    contaJoao.titular = "João"
//    var contaMaria = contaJoao
//    contaMaria.titular = "Maria"
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