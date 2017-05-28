package br.com.fiap.ex2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exercicio2 {

	private static LocalDateTime data = LocalDateTime.of(2012, 9, 10, 12, 00);
	private static String[] formatosData = { "yyyy-MM-dd HH:mm", "dd-MM-yy HH:mm:ss", "EEEE", "yyyy", "G" };

	public static void main(String[] args) {
		for (String formato : formatosData) {
			//Adicionado Locale para imprimir em inglês
			System.out.println(data.format(DateTimeFormatter.ofPattern(formato, Locale.US)));
		}
	}

}
