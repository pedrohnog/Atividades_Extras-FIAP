package br.com.fiap.exemplo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWeb {

	@WebMethod
	public String hello(String nome) {
		return "Hello " + nome;
	}

}
