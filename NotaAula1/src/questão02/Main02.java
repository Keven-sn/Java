package questão02;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");


        int escolha = scanner.nextInt();


        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Resultado da soma: " + calculadora.soma(num1, num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + calculadora.subtracao(num1, num2));
                break;
            case 3:
                System.out.println("Resultado da divisão: " + calculadora.divisao(num1, num2));
                break;
            case 4:
                System.out.println("Resultado da multiplicação: " + calculadora.multiplicacao(num1, num2));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
