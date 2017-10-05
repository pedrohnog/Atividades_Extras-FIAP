package br.com.fiap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mensagem")
@XmlAccessorType(XmlAccessType.FIELD)
public class Mensagem {

	public String retorno;

	public Mensagem() {
		// Construtor padrão
	}

	public Mensagem(String retorno) {
		this.retorno = retorno;
	}

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}

}
