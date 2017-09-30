package br.com.fiap.client;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

public class TesteChamada {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("Pedro");
		a.setTurma("29SCJ");
		a.setMedia(9.2d);
		
		AlunoWeb port = new AlunoWebService().getAlunoWebPort();
		
		Map<String, Object> requestContext = ((BindingProvider) port).getRequestContext();
		
		Map<String, List<String>> headers = new HashMap<>();
		
		headers.put("Username", Collections.singletonList("pedro"));
		headers.put("Senha", Collections.singletonList("123"));
		
		requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		try {
			System.out.println(port.novo(a));
		} catch (Exception_Exception e) {
			e.printStackTrace();
		}
	}

}
