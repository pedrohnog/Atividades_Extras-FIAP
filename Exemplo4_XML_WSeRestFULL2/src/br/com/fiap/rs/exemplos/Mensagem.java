package br.com.fiap.rs.exemplos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mensagem {

	private String retorno;
	
	public Mensagem() {
		//Construtor padrão
	}
	
	public Mensagem(String mensagem) {
		this.retorno = mensagem;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

}
