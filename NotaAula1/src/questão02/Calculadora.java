package questão02;

public class Calculadora {


    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public double divisao(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return Double.NaN;
        }
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }
}
