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

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
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
