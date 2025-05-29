package Academia.controller;

import Academia.model.PlanoTipo;
import Academia.service.AlunoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlunoController {
    private final AlunoService service;
    private final Scanner scanner = new Scanner(System.in);

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    public void menu() {
        while (true) {
            System.out.println("\n--- Menu Aluno ---");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cancelar Matrícula");
            System.out.println("3 - Listar Alunos");
            System.out.print("0 - Voltar: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> cancelar();
                case 3 -> service.listarAlunos();
                case 0 -> { return; }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private void cadastrar() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Data de nascimento (DD/MM/AAAA): ");
        String dataStr = scanner.nextLine().replace("-", "/").replace(" ", "/");
        LocalDate nascimento = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Plano:");
        System.out.println("1 - MENSAL | 2 - TRIMESTRAL | 3 - ANUAL");
        int planoOpcao = scanner.nextInt();
        scanner.nextLine();
        PlanoTipo plano = switch (planoOpcao) {
            case 2 -> PlanoTipo.TRIMESTRAL;
            case 3 -> PlanoTipo.ANUAL;
            default -> PlanoTipo.MENSAL;
        };

        service.cadastrarAluno(nome, nascimento, plano);
    }

    private void cancelar() {
        System.out.print("ID do aluno: ");
        int id = scanner.nextInt();
        service.cancelarMatricula(id);
    }
}
