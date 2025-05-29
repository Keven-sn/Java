package Academia.service;

import Academia.model.Aluno;
import Academia.model.PlanoTipo;
import Academia.util.Validador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private final List<Aluno> alunos = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrarAluno(String nome, LocalDate nascimento, PlanoTipo plano) {
        if (!Validador.validarIdade(nascimento)) {
            System.out.println("Idade mínima para matrícula é 14 anos.");
            return;
        }

        Aluno existente = buscarPorNomeEData(nome, nascimento);
        if (existente != null) {
            System.out.printf("Aluno já cadastrado! ID: %d%n", existente.getId());
            return;
        }

        Aluno novoAluno = new Aluno(proximoId++, nome, nascimento, plano);
        alunos.add(novoAluno);
        System.out.println("Aluno cadastrado com sucesso.");
    }

    public void cancelarMatricula(int id) {
        Aluno aluno = buscarPorId(id);
        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        if (!aluno.isAtivo()) {
            System.out.println("Esse aluno já está com matrícula cancelada.");
            return;
        }

        aluno.setAtivo(false);
        System.out.println("Matrícula cancelada com sucesso.");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        System.out.println("Alunos cadastrados:");
        for (Aluno aluno : alunos) {
            System.out.printf("ID: %d | Nome: %s | Nascimento: %s | Plano: %s | Ativo: %s%n",
                    aluno.getId(),
                    aluno.getNome(),
                    aluno.getNascimento(),
                    aluno.getPlano(),
                    aluno.isAtivo() ? "Sim" : "Não");
        }
    }

    public Aluno buscarPorId(int id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }

    public Aluno buscarPorNomeEData(String nome, LocalDate nascimento) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome) &&
                    aluno.getNascimento().equals(nascimento)) {
                return aluno;
            }
        }
        return null;
    }

    public List<Aluno> listarTodos() {
        return alunos;
    }
}
