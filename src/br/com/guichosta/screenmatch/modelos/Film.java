package br.com.guichosta.screenmatch.modelos;

import br.com.guichosta.screenmatch.calculo.Classificacao;

public class Film extends Titulo implements Classificacao {
    private String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaDasAvaliacoes() / 2;
    }
}
