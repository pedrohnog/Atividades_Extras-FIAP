package br.com.fiap.rs.exemplos;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("resources")
public class Aplicacao extends ResourceConfig {
	
	public Aplicacao() {
		super.packages("br.com.fiap.rs.exemplos");
	}

}
