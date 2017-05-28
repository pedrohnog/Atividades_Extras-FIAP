package br.com.fiap.ex3;

public class Main2 {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Boolean valor = cachorro instanceof ChowChow;
		System.out.println("Verdadeiro ou Falso: " + valor);
	}

}
