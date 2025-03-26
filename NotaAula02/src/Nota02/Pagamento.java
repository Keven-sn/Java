package Nota02;

public class Pagamento {

    public double calcularDesconto(double valorProduto, boolean formaPagamento) {
        if (formaPagamento) {
            return valorProduto * 0.95;
        }
        return valorProduto;
    }

    public void pagamentoCredito(double valorProduto) {
        double parcela = valorProduto / 3;
        System.out.println("Pagamento em Crédito: " + valorProduto + " dividido em 3 parcelas de R$ " + parcela);
    }

    public void pagamentoEspecie(double valorProduto, double valorPago) {
        if (valorPago > valorProduto) {
            double troco = valorPago - valorProduto;
            System.out.println("Pagamento em Espécie: R$ " + valorProduto + ". Troco: R$ " + troco);
        } else {
            System.out.println("Pagamento em Espécie: R$ " + valorProduto);
        }
    }
}
