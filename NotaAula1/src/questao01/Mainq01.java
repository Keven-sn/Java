package questao01;

import java.util.Scanner;

public class Mainq01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Aluno a = new Aluno();

        System.out.println("Digite seu nome: ");
        a.setNome(sc.nextLine());

        System.out.println("Digite sua primeira nota: ");
        a.setNota1(sc.nextDouble());

        System.out.println("Digite sua segunda nota: ");
        a.setNota2(sc.nextDouble());

        System.out.println("Digite sua terceira nota: ");
        a.setNota3(sc.nextDouble());

        a.calcule_media();

        System.out.println("Sua média é: " + a.getMedia());

        double media = a.getMedia(); 

        if (media >= 7) {
            System.out.println("Aprovado!!!");
        } else if (media <= 4) { 
            System.out.println("Reprovado!!!");
        } else { 
            System.out.println("Final!!!");
        }

    }
}
