package IMC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite seu peso:");
        p.setPeso(sc.nextDouble());
        System.out.println("Digite sua altura:");
        p.setAltura(sc.nextDouble());


        p.calcular_IMC();
        System.out.printf("%.1f",p.getIMC());



    }
}
