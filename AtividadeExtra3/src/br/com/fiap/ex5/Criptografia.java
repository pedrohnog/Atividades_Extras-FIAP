package br.com.fiap.ex5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Criptografia {

	public static void main(String[] args) {
		String mensagem = JOptionPane.showInputDialog("Digite uma mensagem");
		gravarArquivo("mensagemCodificada", criptografar(mensagem));
		gravarArquivo("mesagemDecodificada", mensagem);
	}

	public static String criptografar(String texto) {
		StringBuilder criptografado = new StringBuilder(texto);
		for (int i = 0; i < texto.length(); i++) {
			criptografado.setCharAt(i, (char) (criptografado.charAt(i) + 1));
		}
		return criptografado.toString();
	}

	public static void gravarArquivo(String nomeArquivo, String texto) {
		try (FileWriter fw = new FileWriter(nomeArquivo + ".txt"); 
			 PrintWriter out = new PrintWriter(fw);) {
			out.print(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
