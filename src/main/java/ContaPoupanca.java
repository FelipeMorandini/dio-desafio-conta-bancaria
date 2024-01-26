public class ContaPoupanca extends Conta {
    public ContaPoupanca(String tipoCliente, double saldoInicial) {
        super("Poupança", tipoCliente, saldoInicial);
    }

    @Override
    public void calcularValorTarifaManutencao() {
        System.out.println("Calculando tarifa de manutenção para Conta Poupança.");
    }
}