package Academia.controller;

import Academia.service.ProfessorService;

import java.util.Scanner;

public class ProfessorController {
    private final ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Menu Professor ---");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Listar Professores");
            System.out.println("3 - Remover Professor");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplina = scanner.nextLine();
                    service.cadastrarProfessor(nome, disciplina);
                }
                case 2 -> service.listarProfessores();
                case 3 -> {
                    System.out.print("ID do professor a remover: ");
                    int id = scanner.nextInt();
                    service.removerProfessor(id);
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
