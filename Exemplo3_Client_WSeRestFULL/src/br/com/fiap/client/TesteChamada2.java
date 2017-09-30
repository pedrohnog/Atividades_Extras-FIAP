package br.com.fiap.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class TesteChamada2 {

	public static void main(String[] args) {
		AlunoWeb port = new AlunoWebService().getAlunoWebPort();
		
		Map<String, Object> requestContext = ((BindingProvider) port).getRequestContext();
		
		Map<String, List<String>> headers = new HashMap<>();
		
		headers.put("Username", Collections.singletonList("pedro"));
		headers.put("Senha", Collections.singletonList("123"));
		
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		List<Aluno> alunos;
		try {
			alunos = port.listar();
			
			for (Aluno aluno : alunos) {
				System.out.println("Nome: " + aluno.getNome());
				System.out.println("Media: " + aluno.getMedia());
				System.out.println("Turma: " + aluno.getTurma());
			}
		} catch (Exception_Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
