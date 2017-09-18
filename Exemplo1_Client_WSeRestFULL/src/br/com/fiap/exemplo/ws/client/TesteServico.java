package br.com.fiap.exemplo.ws.client;

public class TesteServico {
	
	public static void main(String[] args) {
		HelloWeb service = new HelloWebService().getHelloWebPort();
		
		System.out.println(service.hello("Pedro"));
	}

}
