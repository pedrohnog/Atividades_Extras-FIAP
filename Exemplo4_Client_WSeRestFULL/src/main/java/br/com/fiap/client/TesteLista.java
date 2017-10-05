package br.com.fiap.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class TesteLista {

	public static void main(String[] args) {
		Client cliente = ClientBuilder.newClient();

		WebTarget target = cliente.target("http://localhost:8080/Exemplo4_WSeRestFULL").path("alunos");

		Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);

		Response resposta = invocationBuilder.get();

		Alunos alunos = resposta.readEntity(Alunos.class);

		for (Aluno aluno : alunos.getAlunoList()) {
			System.out.println(aluno.getNome());
		}

	}

}
