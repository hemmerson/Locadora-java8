package com.atividadesoa.modelos;

import java.util.List;

public class Filme extends Video{
    private Integer duracao;


    public Filme() {
    }

    public Filme(String titulo, String genero, Integer anoDeLancamento, String diretor, List<Pessoa> elenco, Integer duracao) {
        super(titulo, genero, anoDeLancamento, diretor, elenco);
        this.duracao = duracao;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

}
