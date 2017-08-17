package br.com.fiap.autenticacao;

import java.security.Principal;

public class PerfilEntidade implements Principal {

	private String descricao;

	public PerfilEntidade(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String getName() {
		return this.descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
