package br.com.fiap.ex2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aeroporto extends Thread {

	private String nome;

	private boolean pistaDisponivel = false;

	public Aeroporto(String nome) {
		this.nome = nome;
	}

	public synchronized boolean isPistaDisponivel() {
		System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
				+ "] AEROPORTO " + this.nome + " VERIFICANDO LIBERAÇÃO DA PISTA");
		while (!this.pistaDisponivel) {
			System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
					+ "] AEROPORTO " + this.nome + " AGUARDANDO LIBERAÇÃO DA PISTA");
			this.alterarEstadoPista();
		}
		System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
				+ "] AEROPORTO " + this.nome + " LIBERANDO PISTA");
		return this.pistaDisponivel;
	}

	public void alterarEstadoPista() {
		try {
			if (!this.pistaDisponivel) {
				sleep(3 * 1000l);
				this.pistaDisponivel = true;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getNome() {
		return this.nome;
	}

	public void setPistaDisponivel(boolean pistaDisponivel) {
		this.pistaDisponivel = pistaDisponivel;
	}

}
