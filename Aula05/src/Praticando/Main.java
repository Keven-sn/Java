package Praticando;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.println("Digite seu nome: ");
        a.nome = sc.nextLine();

        System.out.println("Digite sua primeira nota: ");
        a.nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        a.nota2 = sc.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        a.nota3 = sc.nextDouble();

        a.calcule_media();

        System.out.println("Sua média é: " + a.getMedia());


    }
}