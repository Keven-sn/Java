package questao03;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println("Estoque adicionado! Novo estoque: " + this.quantidadeEmEstoque);
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    public void venderProduto(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Venda realizada! Produtos vendidos: " + quantidade);
            System.out.println("Estoque restante: " + this.quantidadeEmEstoque);
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente para venda.");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque atual do produto " + this.nome + ": " + this.quantidadeEmEstoque);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}
