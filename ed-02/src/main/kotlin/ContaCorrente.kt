class ContaCorrente (
    cliente: String,
    saldo: Float,
    numero: Int,
    agencia: Int
): Conta(cliente, saldo, numero, agencia){

    fun aplicarJuros(dias: Int) {
        saldo += saldo * dias * 0.08F
    }

    override fun imprimirExtrato() {
        println("----------------------")
        println("=== Conta Corrente ===")
        println("Conta/Agencia : 0000$numero/$agencia")
        println("Cliente : $cliente")
        println("Saldo : $saldo")
    }

}