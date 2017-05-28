package br.com.fiap.ex2;

public class Simulador {
	
	public static void main(String[] args) {
		
		Aeroporto aeroporto = new Aeroporto("CONGONHAS");
		aeroporto.start();
		
		Aviao voo1 = new Aviao("TAN 123", aeroporto);
		Aviao voo2 = new Aviao("OLÉ 111", aeroporto);
		Aviao voo3 = new Aviao("LINHA 222", aeroporto);
		
		voo1.start();
		voo2.start();
		voo3.start();
		
	}

}
