package Nota02;

import java.util.Scanner;

public class Pagamento {

    public double calcularDesconto(double valorProduto, boolean formaPagamento) {
        if (formaPagamento) {
            return valorProduto * 0.95;
        }
        return valorProduto;
    }

    public void pagamentoCredito(double valorProduto) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pagamento em Crédito: Parcelamento até 12x.");
        System.out.println("Parcelamento até 3x sem juros.");
        int parcelas = scanner.nextInt();

        if (parcelas >= 1 && parcelas <= 3) {
            double parcela = valorProduto / parcelas;
            System.out.println("Pagamento em Crédito: " + valorProduto + " dividido em " + parcelas + " parcelas de R$ " + parcela);
        } else if (parcelas > 3 && parcelas <= 12) {
            valorProduto *= 1.02;
            double parcelaComJuros = valorProduto / parcelas;
            System.out.println("Pagamento em Crédito com juros de 2%: " + valorProduto + " dividido em " + parcelas + " parcelas de R$ " + parcelaComJuros);
        } else {
            System.out.println("Número de parcelas inválido. O pagamento será realizado à vista.");
        }
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
