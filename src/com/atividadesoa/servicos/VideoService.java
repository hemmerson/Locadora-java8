package com.atividadesoa.servicos;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.soap.SOAPException;
import javax.xml.ws.Endpoint;

import com.atividadesoa.daos.VideoDAO;
import com.atividadesoa.modelos.Usuario;
import com.atividadesoa.modelos.Video;

@WebService
public class VideoService {

    @WebResult(name = "video")
    public List<Video> listarVideos(){
        VideoDAO videoDAO = obterDao();
        return videoDAO.listarVideos();
    }

    public void criarVideo(@WebParam(name = "video") Video video,
        @WebParam(name = "usuario", header = true) Usuario usuario) 
        throws UsuarioNaoAutorizadoException, SOAPException {
            if (usuario.getLogin().equals("soa")
				&& usuario.getSenha().equals("soa")) {
                    obterDao().criarVideo(video);
            }
            else {
                throw new UsuarioNaoAutorizadoException("Usuário não autorizado");
            }
    }


    private VideoDAO obterDao() {
        return new VideoDAO();
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/videos", new VideoService());
        System.out.println("Serviço inicializado");
    }
}
