package br.com.fiap.ex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio1 {

	private static String[] lista = { "VALOR1", "VALOR2", "VALOR3", "VALOR4", "VALOR5", "VALOR6", "VALOR7", "VALOR8",
			"VALOR9", "VALOR10" };

	public static void main(String[] args) {
		Runnable imprimirLista = () -> {
			for (int i = 0; i < lista.length; i++) {
				try {
					System.out.println(lista[i]);
					Thread.sleep(20 * 1000L);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Runnable imprmirHorario = () -> {
			while (true) {
				try {
					System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
					Thread.sleep(10 * 1000L);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Thread thread1 = new Thread(imprimirLista);
		Thread thread2 = new Thread(imprmirHorario);

		thread1.setName("THREAD IMPRMIR LISTA");
		thread2.setName("THREAD IMPRIMIR HORÁRIO");

		thread1.start();
		thread2.start();

		while (true) {
			try {
				System.out.println(thread1.getName() + " -> " + (thread1.isAlive() ? "EM EXECUÇÃO" : "FINALIZADA"));
				System.out.println(thread2.getName() + " -> " + (thread2.isAlive() ? "EM EXECUÇÃO" : "FINALIZADA"));
				Thread.sleep(5 * 1000L);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
