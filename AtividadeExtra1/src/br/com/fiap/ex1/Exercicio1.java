package br.com.fiap.ex1;

public class Exercicio1 {
	
	public int[] inverterVetor(int[] vetorA) {
		int[] vetorB = new int[vetorA.length];
		for (int i = vetorA.length - 1, j = 0; i >= 0; i--, j++) {
			vetorB[j] = vetorA[i];
		}
		return vetorB;
	}
	
	public static void main(String[] args) {
		int[] vetorA = {1,2,3};
		
		Exercicio1 ex1 = new Exercicio1();
		int[] vetorB = ex1.inverterVetor(vetorA);
		for (int i : vetorB) {
			System.out.println(i);
		}
	}

}
