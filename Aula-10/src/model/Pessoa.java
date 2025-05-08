package model;

public abstract class Pessoa {
    private String nome;
    private int idade;
    public abstract void quem_sou_eu();
    //get e set para nome e idade
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
