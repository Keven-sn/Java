package Academia.controller;

import Academia.model.PlanoTipo;
import Academia.service.AlunoService;

import java.time.LocalDate;

public class AlunoController {
    private final AlunoService service;

    public AlunoController() {
        this.service = service;
    }

    public void cadastrarAluno(String nome, LocalDate nascimento, PlanoTipo plano) {
        service.cadastrarAluno(nome, nascimento, plano);
    }

    public void cancelarMatricula(int id) {
        service.cancelarMatricula(id);
    }

    public void listarAlunos() {
        service.listarAlunos();
    }
}
