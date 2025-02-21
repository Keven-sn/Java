import java.util.Scanner;

public class MainEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 1;
        int repetir = 0;

        do {
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Nome do usuario: "+nome);



            System.out.println("Informe sua idade:");
            int idade = sc.nextInt();
            System.out.println("idade: "+idade + " anos");

            System.out.println("Informe sua altura:");
            double altura = sc.nextDouble();
            System.out.println("Altura: " + altura +" cm");


            System.out.println("Digite 0 para cadastrar novamente:\n");
            repetir=sc.nextInt();

        }while (repetir ==0);











    }
}
