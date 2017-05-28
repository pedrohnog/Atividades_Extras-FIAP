package br.com.fiap.ex5;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public int calcularFatorial(int valor) {
		int resultado = 1;
		
		for (int i = valor; i > 0; i--) {
			resultado *= i;
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		try {
			Integer valorFatorial = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor que deseja calcular o fatorial"));
			
			Exercicio5 ex5 = new Exercicio5();
			
			System.out.println(ex5.calcularFatorial(valorFatorial));
		} catch (NumberFormatException e) {
			System.err.println("Informe somente valores numéricos!");
		}
		
	}

}
