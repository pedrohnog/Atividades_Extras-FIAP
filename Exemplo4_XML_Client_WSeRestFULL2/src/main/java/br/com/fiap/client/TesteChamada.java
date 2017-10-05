package br.com.fiap.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class TesteChamada {
	
	public static void main(String[] args) {
		Client cliente = ClientBuilder.newClient();
		
		WebTarget target = cliente.target("http://localhost:8080/Exemplo4_WSeRestFULL").path("exemplo");
		
		Builder invocationBuilder = target.request(MediaType.TEXT_PLAIN);
		
		Response resposta = invocationBuilder.get();
		
		String retorno = resposta.readEntity(String.class);
		
		System.out.println(retorno);
	}
	
}
