package br.com.fiap.ex3;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		try {
			Integer qtdeFunc = Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de funcionários"));
			
			double[] salarios = new double[qtdeFunc];
			
			for (int i = 0; i < salarios.length; i++) {
				salarios[i] = Double.valueOf(JOptionPane.showInputDialog("Informe o salário do funcionário " + i));
			}
			
			double somatorioSalarios = 0;
			for (int i = 0; i < salarios.length; i++) {
				somatorioSalarios += salarios[i];
			}
			
			System.out.println(somatorioSalarios / salarios.length);
		} catch(NumberFormatException e) {
			System.err.println("Informe somente valores numéricos!");
		}
	}

}
