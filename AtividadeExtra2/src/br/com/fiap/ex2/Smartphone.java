package br.com.fiap.ex2;

public class Smartphone extends Movel {
	
	private String tamanho;

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void ligar() {
		System.out.println("Ligar via teclado");
	}

	public void desligar() {
		System.out.println("Desligar via teclado");
	}

}
