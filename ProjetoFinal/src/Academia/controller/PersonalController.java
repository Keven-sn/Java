package Academia.controller;

import Academia.service.PersonalService;

import java.util.Scanner;

public class PersonalController {
    private final PersonalService service;

    public PersonalController(PersonalService service) {
        this.service = service;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Menu Personal Trainer ---");
            System.out.println("1 - Cadastrar Personal");
            System.out.println("2 - Listar Personais");
            System.out.println("3 - Contratar Personal");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    service.cadastrarPersonal(nome);
                }
                case 2 -> service.listarPersonais();
                case 3 -> {
                    System.out.print("ID do Personal a contratar: ");
                    int id = scanner.nextInt();
                    service.contratarPersonal(id);
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
