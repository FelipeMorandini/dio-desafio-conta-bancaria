public aspect VerificacaoSaldoAspect {
    pointcut saque(Conta conta, double valor):
        execution(void Conta.sacar(double)) && args(valor) && target(conta);

    before(Conta conta, double valor): saque(conta, valor) {
        if (conta.saldo < valor) {
            // Loga a tentativa de saque com saldo insuficiente
            System.out.println("Tentativa de saque com saldo insuficiente na conta do tipo: " + conta.tipoConta);
        }
    }
}