import java.util.Date;

public abstract class Conta {
    protected String tipoConta;
    protected String tipoCliente;
    protected Date dataAbertura;
    protected double saldo;

    public Conta(String tipoConta, String tipoCliente, double saldoInicial) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = new Date();
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + this.saldo);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque de: " + valor);
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso. Saldo atual: " + this.saldo);
    }

    public abstract void calcularValorTarifaManutencao();
}
