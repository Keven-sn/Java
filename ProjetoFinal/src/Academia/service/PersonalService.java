package Academia.service;

import Academia.model.PersonalTrainer;

import java.util.ArrayList;
import java.util.List;

public class PersonalService {
    private final List<PersonalTrainer> personals = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrarPersonal(String nome) {
        PersonalTrainer personal = new PersonalTrainer(proximoId++, nome);
        personals.add(personal);
        System.out.println("Personal trainer cadastrado com sucesso.");
    }

    public void listarPersonais() {
        if (personals.isEmpty()) {
            System.out.println("Nenhum personal cadastrado.");
            return;
        }

        System.out.println("Lista de Personais:");
        for (PersonalTrainer p : personals) {
            System.out.printf("ID: %d | Nome: %s | Contratado: %s%n",
                    p.getId(), p.getNome(), p.isContratado() ? "Sim" : "Não");
        }
    }

    public void contratarPersonal(int id) {
        for (PersonalTrainer p : personals) {
            if (p.getId() == id) {
                if (p.isContratado()) {
                    System.out.println("Este personal já está contratado.");
                } else {
                    p.setContratado(true);
                    System.out.println("Personal contratado com sucesso.");
                }
                return;
            }
        }
        System.out.println("Personal não encontrado.");
    }
}
