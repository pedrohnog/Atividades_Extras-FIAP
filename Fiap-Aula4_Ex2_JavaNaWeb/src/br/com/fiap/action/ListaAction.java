package br.com.fiap.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import br.com.fiap.model.Controle;
import br.com.fiap.struts.Pessoa;

@Namespace("/")
public class ListaAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private List<Pessoa> pessoas;

	@Action(value = "listar", results = { @Result(name = "success", location = "/lista.jsp")})
	public String execute() throws Exception {
		this.pessoas = Controle.lerRegistros();
		return SUCCESS;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
