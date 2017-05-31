package br.com.fiap.ex2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aeroporto extends Thread {

	private String nome;

	private boolean pistaDisponivel = false;

	public Aeroporto(String nome) {
		this.nome = nome;
	}

	@Override
	public void run() {
		while(true) {
			this.alterarEstadoPista();
			this.aguardarPistaDisponivel();
		}
	}

	public synchronized void aguardarPistaDisponivel() {
		System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
				+ "] AEROPORTO " + this.nome + " VERIFICANDO LIBERAÇÃO DA PISTA");
		if (!this.pistaDisponivel) {
			try {
				System.out
						.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
								+ "] AEROPORTO " + this.nome + " AGUARDANDO LIBERAÇÃO DA PISTA");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
				+ "] AEROPORTO " + this.nome + " LIBERANDO PISTA");
	}

	public synchronized void alterarEstadoPista() {
		try {
			while (true) {
				sleep(3 * 1000l);
				this.pistaDisponivel = !this.pistaDisponivel;
				if (this.pistaDisponivel) {
					notifyAll();
				}
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

	public boolean isPistaDisponivel() {
		return pistaDisponivel;
	}

}
