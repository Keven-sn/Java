package Praticando;

public class Aluno {

    String nome;

    double nota1, nota2, nota3, media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        calcule_media();
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }


    public void calcule_media(){
        media = (nota1 + nota2 + nota3) / 3;
    }








}
