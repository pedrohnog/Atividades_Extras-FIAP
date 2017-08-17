package br.com.fiap.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/")
public class CrudExemploAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String mensagem;

	@Action(value = "welcome", results = { @Result(name = "success", location = "/sucesso.jsp") })
	public String execute() throws Exception {
		this.mensagem = "BEM-VINDO";
		return SUCCESS;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}