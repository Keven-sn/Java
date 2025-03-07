package questão01;

import java.util.Scanner;

public class Mainq01 {
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

        System.out.println("Sua média é: " +a.media );


        if (a.media>=7){
            System.out.println(" Aprovado!!!");
        } else if (a.media<7) {
            System.out.println(" Final!!!");
        } else if (a.media<=4){
            System.out.println( "Reprovado!!!");
        }


    }
}
