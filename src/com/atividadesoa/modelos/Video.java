package com.atividadesoa.modelos;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({ Filme.class, Serie.class })
public class Video {

    private String titulo;
    private String genero;
    private Integer anoDeLancamento;
    private String diretor;
    private Date dataDeCriacao = new Date();

    @XmlElementWrapper(name = "elenco")
    @XmlElement(name = "pessoa")
    @XmlJavaTypeAdapter(value = AdaptadorPessoa.class)
    private List<Pessoa> elenco;

    public Video() {
    }

    public Video(String titulo, String genero, Integer anoDeLancamento, String diretor, List<Pessoa> elenco) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoDeLancamento = anoDeLancamento;
        this.diretor = diretor;
        this.elenco = elenco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(Integer anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Date getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(Date dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public List<Pessoa> getElenco() {
        return elenco;
    }

    public void setElenco(List<Pessoa> elenco) {
        this.elenco = elenco;
    }

    public static class AdaptadorPessoa extends XmlAdapter<String, Pessoa> {

        @Override
        public Pessoa unmarshal(String pessoa) throws Exception {
            String nome = pessoa.split(" ")[0];
            String sobrenome = pessoa.split(" ")[1];
            return new Pessoa(nome, sobrenome);
        }

        @Override
        public String marshal(Pessoa pessoa) throws Exception {
            return pessoa.getNome()+" "+pessoa.getSobrenome();
        }
    }

}
