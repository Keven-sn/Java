package questao04;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + this.saldo);
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        } else {
            this.saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência realizada com sucesso! Novo saldo: R$ " + this.saldo);
        }
    }
}
