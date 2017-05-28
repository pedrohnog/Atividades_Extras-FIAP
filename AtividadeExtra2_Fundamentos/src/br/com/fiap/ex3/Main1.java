package br.com.fiap.ex3;

public class Main1 {

	public static void main(String[] args) {
		ChowChow chowChow = new ChowChow();
		Boolean valor = chowChow instanceof Cachorro;
		System.out.println("Verdadeiro ou Falso: " + valor);
	}

}
