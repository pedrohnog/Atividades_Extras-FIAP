package br.com.fiap;

import java.io.Serializable;

public class Item implements Serializable {

	private static final long serialVersionUID = -448204808005407589L;
	
	private String nome;
	private double preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}