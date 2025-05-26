package Academia.repository;

import Academia.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private final List<Aluno> alunos;
    private int contadorId;

    public AlunoRepository() {
        this.alunos = new ArrayList<>();
        this.contadorId = 1;
    }

    public void salvar(Aluno aluno) {
        if (aluno.getId() == 0) {
            aluno.setId(contadorId++);
        }
        alunos.add(aluno);
    }

    public Aluno buscarPorId(int id) {
        for (Aluno a : alunos) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public List<Aluno> listarTodos() {
        return alunos;
    }
}
