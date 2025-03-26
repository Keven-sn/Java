package Nota02;

public class Produto {

    private int codigo;
    private String nome;
    private double tamanhoPeso;
    private String cor;
    private double valor;
    private int quantidadeEstoque;

    public Produto(int codigo, String nome, double tamanhoPeso, String cor, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanhoPeso = tamanhoPeso;
        this.cor = cor;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanhoPeso() {
        return tamanhoPeso;
    }

    public void setTamanhoPeso(double tamanhoPeso) {
        this.tamanhoPeso = tamanhoPeso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean vender(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada! Novo estoque: " + quantidadeEstoque);
            return true;
        } else {
            System.out.println("Estoque insuficiente para realizar a venda.");
            return false;
        }
    }
}
