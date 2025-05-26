package Academia.model;

import java.time.LocalDate;

public class Aluno {
    private int id;
    private String nome;
    private LocalDate nascimento;
    private PlanoTipo plano;
    private boolean ativo;

    public Aluno(int id, String nome, LocalDate nascimento, PlanoTipo plano) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.plano = plano;
        this.ativo = true;
    }

    public int getId() {
        return id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public PlanoTipo getPlano() {
        return plano;
    }
    public void setId(int id) {
        this.id = id;
    }

}
