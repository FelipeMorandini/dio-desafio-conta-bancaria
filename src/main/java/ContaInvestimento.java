public class ContaInvestimento extends Conta {
    public ContaInvestimento(String tipoCliente, double saldoInicial) {
        super("Investimento", tipoCliente, saldoInicial);
    }

    @Override
    public void calcularValorTarifaManutencao() {
        System.out.println("Calculando tarifa de manutenção para Conta Investimento.");
    }
}
