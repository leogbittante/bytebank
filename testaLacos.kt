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