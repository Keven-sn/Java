package Academia.controller;

import Academia.model.PlanoTipo;
import Academia.repository.AlunoRepository;
import Academia.service.AlunoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class AlunoController {
    private final AlunoService service;
    private final Scanner scanner = new Scanner(System.in);

    public AlunoController() {
        Academia.repository.AlunoRepository repo = new AlunoRepository();
        this.service = new AlunoService(repo);
    }

    public void menu() {
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cancelar Matrícula");
            System.out.println("3 - Listar Alunos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> cancelar();
                case 3 -> service.listarAlunos(); // ← Aqui está a nova opção
                case 0 -> {
                    System.out.println("Encerrando o programa...");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }


    private void cadastrar() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Nascimento (DD/MM/AAAA): ");
        String dataEntrada = scanner.nextLine()
                .replace("-", "/")
                .replace(" ", "/");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nasc;

        try {
            nasc = LocalDate.parse(dataEntrada, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida! Use o formato DD/MM/AAAA.");
            return;
        }

        System.out.println("Escolha o plano:");
        System.out.println("1 - MENSAL");
        System.out.println("2 - TRIMESTRAL");
        System.out.println("3 - ANUAL");
        System.out.print("Opção: ");
        int opcaoPlano = scanner.nextInt();
        scanner.nextLine();

        PlanoTipo plano = switch (opcaoPlano) {
            case 1 -> PlanoTipo.MENSAL;
            case 2 -> PlanoTipo.TRIMESTRAL;
            case 3 -> PlanoTipo.ANUAL;
            default -> {
                System.out.println("Opção inválida! Plano MENSAL selecionado por padrão.");
                yield PlanoTipo.MENSAL;
            }
        };

        service.cadastrarAluno(nome, nasc, plano);
    }

    private void cancelar() {
        System.out.print("ID do aluno: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        service.cancelarMatricula(id);
    }

}

