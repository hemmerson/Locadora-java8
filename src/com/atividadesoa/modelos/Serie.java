package com.atividadesoa.modelos;

import java.util.List;

public class Serie extends Video{

    private Integer numeroDeTemporadas;
    private Integer numeroDeEpisodios;

    public Serie() {
    }

    public Serie(String titulo, String genero, Integer anoDeLancamento, String diretor, List<Pessoa> elenco, Integer numeroDeTemporadas, Integer numeroDeEpisodios) {
        super(titulo, genero, anoDeLancamento, diretor, elenco);
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public Integer getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(Integer numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public Integer getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    public void setNumeroDeEpisodios(Integer numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }
}
