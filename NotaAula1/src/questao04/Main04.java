package questao04;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        while (true) {

            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:

                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    break;
                case 2:

                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:

                    System.out.print("Digite o valor para saque: R$ ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:

                    System.out.print("Digite o valor para transferência: R$ ");
                    double valorTransferencia = scanner.nextDouble();


                    ContaBancaria contaDestino = new ContaBancaria();

                    conta.transferir(contaDestino, valorTransferencia);

                    System.out.println("Saldo da conta destino: R$ " + contaDestino.consultarSaldo());
                    break;
                case 5:

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
