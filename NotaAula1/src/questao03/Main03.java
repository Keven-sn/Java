package questao03;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Produto produto = new Produto("Produto Exemplo", 50.0,100);

        while (true) {

            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Vender produto");
            System.out.println("3 - Exibir estoque");
            System.out.println("4 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:

                    System.out.print("Digite a quantidade a adicionar ao estoque: ");
                    int qtdAdicionar = scanner.nextInt();
                    produto.adicionarEstoque(qtdAdicionar);
                    break;
                case 2:

                    System.out.print("Digite a quantidade a vender: ");
                    int qtdVender = scanner.nextInt();
                    produto.venderProduto(qtdVender);
                    break;
                case 3:

                    produto.exibirEstoque();
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
