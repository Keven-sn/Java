import java.util.Scanner;

public class MainEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Nome completo: " + nome + " " + sobrenome);

        scanner.close();
    }
}