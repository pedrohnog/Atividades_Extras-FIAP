package br.com.fiap.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class TesteLista {

	public static void main(String[] args) {
		Client cliente = ClientBuilder.newClient();

		WebTarget target = cliente.target("http://localhost:8080/Exemplo4_WSeRestFULL").path("alunos").path("2");

		Builder invocationBuilder = target.request(MediaType.APPLICATION_XML);

		Response resposta = invocationBuilder.delete();

		Mensagem m = resposta.readEntity(Mensagem.class);

		System.out.println(m.retorno);

	}

}
