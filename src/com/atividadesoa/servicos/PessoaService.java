package com.atividadesoa.servicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.atividadesoa.modelos.Pessoa;

@WebService
public class PessoaService {

    public List<Pessoa> listarPessoas() {
        Pessoa elijahWood = new Pessoa("Elijah", "Wood");
        Pessoa ianMcKellen = new Pessoa("Ian", "McKellen");
        Pessoa viggoMortensen = new Pessoa("Viggo", "Mortensen");
        return new ArrayList<>(Arrays.asList(elijahWood, ianMcKellen, viggoMortensen));
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/pessoas", new PessoaService());
    }
}
