package br.com.fiap.rs.exemplos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("exemplo")
public class OlaWeb {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ola() {
		return "Olá meu amigo";
	}
	
	@GET
	@Path("/vamos")
	@Produces(MediaType.TEXT_PLAIN)
	public String tudobem() {
		return "Tudo bem. Vamos embora.";
	}
	
	@GET
	@Path("/saudacao/{nome}")
	@Produces(MediaType.TEXT_PLAIN)
	public String saudacao(@PathParam("nome") String nome) {
		return "Boa tarde " + nome;
	}

}
