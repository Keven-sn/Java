package Academia.service;

import Academia.model.Aluno;
import Academia.model.PlanoTipo;
import Academia.repository.AlunoRepository;
import Academia.util.Validador;

import java.time.LocalDate;
import java.util.List;

public class AlunoService {
    private final AlunoRepository repo;

    public AlunoService(AlunoRepository repo) {
        this.repo = repo;
    }

    public void cadastrarAluno(String nome, LocalDate nascimento, PlanoTipo plano) {
        if (!Validador.validarIdade(nascimento)) {
            System.out.println("Idade mínima para matrícula é 14 anos.");
            return;
        }
        Aluno aluno = new Aluno(0, nome, nascimento, plano);
        repo.salvar(aluno);
        System.out.println("Aluno cadastrado com sucesso.");
    }

    public void cancelarMatricula(int id) {
        Aluno aluno = repo.buscarPorId(id);
        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }
        aluno.setAtivo(false);
        System.out.println("Matrícula cancelada.");
    }

    public void listarAlunos() {
        List<Aluno> alunos = (List<Aluno>) repo.listarTodos();
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
}
