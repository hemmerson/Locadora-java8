package com.atividadesoa.daos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.atividadesoa.modelos.Filme;
import com.atividadesoa.modelos.Pessoa;
import com.atividadesoa.modelos.Serie;
import com.atividadesoa.modelos.Video;

public class VideoDAO {

    private static List<Video> videos;

    static {
        videos = new ArrayList<>();

        Filme filme1 = new Filme("O Senhor dos Anéis: A Sociedade do Anel", "Fantasia/Aventura", 2001, "Peter Jackson",
                new ArrayList<>(
                        Arrays.asList(new Pessoa("Elijah", "Wood"),
                                    new Pessoa("Ian","McKellen"),
                                new Pessoa("Viggo", "Mortensen"),
                                new Pessoa("Sean", "Astin"))
                ),178);

        Filme filme2 = new Filme("O Senhor dos Anéis: As Duas Torres", "Fantasia/Aventura", 2002, "Peter Jackson",
                new ArrayList<>(
                        Arrays.asList(new Pessoa("Elijah", "Wood"),
                                new Pessoa("Ian","McKellen"),
                                new Pessoa("Viggo", "Mortensen"),
                                new Pessoa("Sean", "Astin"))
                ),179);

        Filme filme3 = new Filme("O Senhor dos Anéis: O Retorno do Rei", "Fantasia/Aventura", 2003, "Peter Jackson",
                new ArrayList<>(
                        Arrays.asList(new Pessoa("Elijah", "Wood"),
                                new Pessoa("Ian","McKellen"),
                                new Pessoa("Viggo", "Mortensen"),
                                new Pessoa("Sean", "Astin"))
                ),201);

        Serie serie1 = new Serie("O Senhor dos Anéis: Os Anéis de Poder", "Drama", 2022, " John D. Payne, Patrick McKay",
                new ArrayList<>(
                        Arrays.asList(new Pessoa("Morfydd","Clark"),
                                new Pessoa("Robert", "Aramayo"),
                                new Pessoa("Sophia", "Nomvete"),
                                new Pessoa("Markella", "Kavenagh"),
                                new Pessoa("Charlie", "Vickers"))
                ),1, 8);

        videos.add(filme1);
        videos.add(filme2);
        videos.add(filme3);
        videos.add(serie1);
    }

    public List<Video> listarVideos(){
        return videos;
    }

    public void criarVideo(Video video){
        videos.add(video);
    }

}
