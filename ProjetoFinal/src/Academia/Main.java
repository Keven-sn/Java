package Academia;

import Academia.controller.AlunoController;
import Academia.controller.FuncionarioController;
import Academia.controller.PersonalController;
import Academia.controller.ProfessorController;
import Academia.service.AlunoService;
import Academia.service.FuncionarioService;
import Academia.service.PersonalService;
import Academia.service.ProfessorService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AlunoService alunoService = new AlunoService();
        FuncionarioService funcionarioService = new FuncionarioService();
        ProfessorService professorService = new ProfessorService();
        PersonalService personalService = new PersonalService();

        AlunoController alunoController = new AlunoController(alunoService);
        FuncionarioController funcionarioController = new FuncionarioController(funcionarioService);
        ProfessorController professorController = new ProfessorController(professorService);
        PersonalController personalController = new PersonalController(personalService);

        while (true) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Gerenciar Alunos");
            System.out.println("2 - Gerenciar Professores");
            System.out.println("3 - Gerenciar Funcionários");
            System.out.println("4 - Gerenciar Personais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> alunoController.menu();
                case 2 -> professorController.menu();
                case 3 -> funcionarioController.menu();
                case 4 -> personalController.menu();
                case 0 -> {
                    System.out.println("Encerrando o sistema.");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
