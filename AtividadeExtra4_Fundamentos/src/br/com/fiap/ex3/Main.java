package br.com.fiap.ex3;

public class Main {

	public static void main(String[] args) {
		
		for (Cores cor : Cores.values()) {
			System.out.println(cor.recuperarNomeCor() + " - " + cor.recuperarCodigoCor());
		}
		
		System.out.println(Cores.BRANCO.recuperarCodigoCor());
		
	}

}
