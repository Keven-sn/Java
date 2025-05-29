package Academia.model;

public class PersonalTrainer {
    private int id;
    private String nome;
    private boolean contratado;

    public PersonalTrainer(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.contratado = false;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public boolean isContratado() { return contratado; }
    public void setContratado(boolean contratado) { this.contratado = contratado; }
}
