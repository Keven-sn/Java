package Nota02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = null;

        System.out.println("Cadastro do produto:");

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tamanho ou peso do produto: ");
        double tamanhoPeso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a cor do produto: ");
        String cor = scanner.nextLine();
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        produto = new Produto(codigo, nome, tamanhoPeso, cor, valor, quantidadeEstoque);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Realizar pagamento");
            System.out.println("4 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Estoque atual do produto: " + produto.getQuantidadeEstoque());
                    break;
                case 2:
                    System.out.print("Digite a quantidade a ser vendida: ");
                    int quantidadeVenda = scanner.nextInt();
                    boolean vendaRealizada = produto.vender(quantidadeVenda);
                    if (!vendaRealizada) {
                        System.out.println("Venda não realizada devido a falta de estoque.");
                    }
                    break;
                case 3:
                    System.out.println("Escolha a forma de pagamento:");
                    System.out.println("1 - Pix, Espécie, Transferência ou Débito");
                    System.out.println("2 - Crédito (Parcelamento até 12x, até 3x sem juros)");

                    int formaPagamento = scanner.nextInt();
                    Pagamento pagamento = new Pagamento();
                    double valorFinal = produto.getValor();

                    if (formaPagamento == 1) {
                        valorFinal = pagamento.calcularDesconto(valorFinal, true);
                        System.out.println("Valor com 5% de desconto: R$ " + valorFinal);

                        System.out.print("Digite o valor pago (em espécie, transferências ou Pix): ");
                        double valorPago = scanner.nextDouble();
                        pagamento.pagamentoEspecie(valorFinal, valorPago);
                    } else if (formaPagamento == 2) {
                        pagamento.pagamentoCredito(valorFinal);
                    } else {
                        System.out.println("Opção de pagamento inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
