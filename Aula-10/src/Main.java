import controller.ProfessorController;
import model.Professor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProfessorController professorController = new ProfessorController();
        Professor p = new Professor();

        System.out.println("Digite o nome do professor");
        p.setNome(scanner.next());
        System.out.println("Digite a idade do professor");
        p.setIdade(scanner.nextInt());
        System.out.println("Digite a especialização do professor");
        p.setEspecializacao(scanner.next());

        professorController.cadastrarProfessor(p);






    }
}
