abstract class Conta (
    var cliente: String,
    var saldo: Float = 0.0F,
    var numero: Int,
    var agencia: Int
): Extrato {

    fun depositar(valor: Float) {
        saldo += valor
    }

    fun retirar(valor: Float) {
        saldo -= valor
    }

    fun transferir(destino: Conta, valor: Float) {
        this.saldo -= valor
        destino.saldo += valor
    }

    abstract override fun imprimirExtrato()
}