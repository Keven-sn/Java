package Academia.model;

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;

    public Funcionario(int id, String nome, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getCargo() { return cargo; }

    public void setCargo(String cargo) { this.cargo = cargo; }
}
