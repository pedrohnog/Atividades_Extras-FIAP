package br.com.fiap.ex2;

public class Tablet extends Movel {
	
	private String fabricante;
	private String tecnologia;

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public void ligar() {
		System.out.println("Ligar via touch");
	}

	public void desligar() {
		System.out.println("Desligar via touch");
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
