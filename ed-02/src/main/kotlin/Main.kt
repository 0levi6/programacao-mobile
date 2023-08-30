fun main(args: Array<String>) {
    var contaExemplo1 = ContaCorrente("Homer Simpson", 12.00F, 123, 12)
    var contaExemplo2 = ContaPoupanca("Bart Simpson", 12000.00F, 123, 12)

    contaExemplo1.imprimirExtrato()
    contaExemplo2.imprimirExtrato()

    //--------------------------------------------------


    val contas = mutableListOf<Conta>()

    contas.add(ContaCorrente("Fulano da Silva", 2000.00F, 524, 13))
    contas.add(ContaCorrente("Ciclano da Silva", 3000.00F, 726, 13))

    contas.add(ContaPoupanca("Fulano de Andrade", 2000.00F, 837, 13))

    for (contas in contas)
        contas.imprimirExtrato()
}