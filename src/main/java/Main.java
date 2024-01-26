public class Main {
    public static void main(String[] args) {
        Conta contaPoupanca = new ContaPoupanca("ClienteA", 1000.00);
        Conta contaInvestimento = new ContaInvestimento("ClienteB", 2000.00);

        contaPoupanca.depositar(500.00);
        contaInvestimento.depositar(1500.00);

        try {
            contaPoupanca.sacar(200.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            contaInvestimento.sacar(4000.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        contaPoupanca.calcularValorTarifaManutencao();
        contaInvestimento.calcularValorTarifaManutencao();
    }
}