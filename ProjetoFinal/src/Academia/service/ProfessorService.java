package Academia.service;

import Academia.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorService {
    private final List<Professor> professores = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrarProfessor(String nome, String disciplina) {
        Professor professor = new Professor(proximoId++, nome, disciplina);
        professores.add(professor);
        System.out.println("Professor cadastrado com sucesso.");
    }

    public void listarProfessores() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado.");
            return;
        }

        System.out.println("Lista de Professores:");
        for (Professor p : professores) {
            System.out.printf("ID: %d | Nome: %s | Disciplina: %s%n", p.getId(), p.getNome(), p.getDisciplina());
        }
    }

    public Professor buscarPorId(int id) {
        for (Professor p : professores) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void removerProfessor(int id) {
        Professor professor = buscarPorId(id);
        if (professor != null) {
            professores.remove(professor);
            System.out.println("Professor removido com sucesso.");
        } else {
            System.out.println("Professor não encontrado.");
        }
    }
}
