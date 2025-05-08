package model;

import enums.Classificacao;
import model.interfaces.Folha;

public final class Professor extends Pessoa implements Folha {
    private String especialização;
    //get e set para especialização
    @Override
    public void quem_sou_eu() {
        System.out.println(Classificacao.Professor);
    }
    @Override
    public String toString() {
        return super.toString()+ "especialização=" + especialização;
    }
    @Override
    public void calculaSalario() {
        System.out.println("(horas trabalhadas x valor hora)");
    }

    public void setNome(String novoNome) {
    String getNome; {
        }
        }


    public void setIdade(int i) {
    }

    public void setEspecializacao(String next) {
    }
}