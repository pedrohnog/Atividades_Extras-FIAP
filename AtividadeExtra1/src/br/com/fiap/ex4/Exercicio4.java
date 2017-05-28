package br.com.fiap.ex4;

import javax.swing.JOptionPane;

public class Exercicio4 {
	
	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	public int somar(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
	public int subtrair(int valor1, int valor2) {
		return valor1 - valor2;
	}
	
	public double multiplicar(double valor1, double valor2) {
		return valor1 * valor2;
	}
	
	public int multiplicar(int valor1, int valor2) {
		return valor1 * valor2;
	}
	
	public double dividir(double valor1, double valor2) {
		return valor1 / valor2;
	}
	
	public int dividir(int valor1, int valor2) {
		return valor1 / valor2;
	}
	
	public static void main(String[] args) {
		Exercicio4 ex4 = new Exercicio4();
		
		try {
			int valor1 = Integer.valueOf(JOptionPane.showInputDialog("Digite um valor inteiro"));
			int valor2 = Integer.valueOf(JOptionPane.showInputDialog("Digite outro valor inteiro"));
			double valor3 = Double.valueOf(JOptionPane.showInputDialog("Digite um valor duplo"));
			double valor4 = Double.valueOf(JOptionPane.showInputDialog("Digite outro valor duplo"));
			
			System.out.println("VALORES INTEIROS");
			System.out.println("SOMA = " + ex4.somar(valor1, valor2));
			System.out.println("SUBTRACAO = " + ex4.subtrair(valor1, valor2));
			System.out.println("MULTIPLICACAO = " + ex4.multiplicar(valor1, valor2));
			System.out.println("DIVISAO = " + ex4.dividir(valor1, valor2));
			
			System.out.println("============================================");
			
			System.out.println("VALORES DUPLOS");
			System.out.println("SOMA = " + ex4.somar(valor3, valor4));
			System.out.println("SUBTRACAO = " + ex4.subtrair(valor3, valor4));
			System.out.println("MULTIPLICACAO = " + ex4.multiplicar(valor3, valor4));
			System.out.println("DIVISAO = " + ex4.dividir(valor3, valor4));
			
		} catch(NumberFormatException e) {
			System.err.println("Informe somente valores numéricos!");
		}
	}

}
