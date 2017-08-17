package br.com.fiap.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import br.com.fiap.model.Controle;
import br.com.fiap.struts.Pessoa;

@Namespace("/")
public class PessoaAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Pessoa pessoa;
	private String mensagem;

	public PessoaAction() {
		pessoa = new Pessoa();
	}

	@Action(value = "cadastrar", results = {
			@Result(name = "success", location = "/sucesso.jsp"),
			@Result(name = "error", location = "/erro.jsp") })
	public String execute() throws Exception {
		if (pessoa != null && pessoa.getNome() != null && !"".equals(pessoa.getNome())) {
			Controle.adicionarRegistro(pessoa);
			this.mensagem = "Tudo certo com seu cadastro";
		} else {
			this.mensagem = "Erro no cadastro";
		}
		return SUCCESS;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
