package br.com.fiap.ex1;

import javax.swing.JOptionPane;

public class Calculadora implements CalculadoraBasica {

	@Override
	public float somar(float op1, float op2) {
		return op1 + op2;
	}

	@Override
	public float subtrair(float op1, float op2) {
		return op1 - op2;
	}

	@Override
	public float dividir(float op1, float op2) {
		return op1 / op2;
	}

	@Override
	public float multiplicar(float op1, float op2) {
		return op1 * op2;
	}
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		try {
			Float op1 = Float.valueOf(JOptionPane.showInputDialog("Informe o primeiro valor"));
			
			if(op1 == 0) {
				throw new Exception();
			}
			
			Float op2 = Float.valueOf(JOptionPane.showInputDialog("Informe o segundo valor"));
			
			System.out.println("SOMA = " + calc.somar(op1, op2));
			System.out.println("SUBTRACAO = " + calc.subtrair(op1, op2));
			System.out.println("MULTIPLICACAO = " + calc.multiplicar(op1, op2));
			System.out.println("DIVISAO = " + calc.dividir(op1, op2));
		} catch(NumberFormatException e) {
			System.err.println("Informe somente valores numéricos!");
		} catch(Exception e) {
			System.err.println("Operador 1 não pode ser igual a 0");
		}
	}

}
