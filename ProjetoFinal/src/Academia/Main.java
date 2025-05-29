package Academia;

import Academia.controller.AlunoController;
import Academia.model.PlanoTipo;
import Academia.service.AlunoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlunoController alunoController = new AlunoController();

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
                case 1 -> {
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
                        break;
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
                        default -> PlanoTipo.MENSAL;
                    };

                    alunoController.cadastrarAluno(nome, nasc, plano);
                }

                case 2 -> {
                    System.out.print("ID do aluno para cancelar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    alunoController.cancelarMatricula(id);
                }

                case 3 -> alunoController.listarAlunos();

                case 0 -> {
                    System.out.println("Encerrando...");
                    return;
                }

                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
