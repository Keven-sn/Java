package IMC;

public class Pessoa {
    private double IMC,peso,altura;

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void calcular_IMC(){
        IMC = peso/(altura*altura);
    }



























}
