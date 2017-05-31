package br.com.fiap.ex2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aviao extends Thread {

	private String nomeVoo;
	private Aeroporto aeroporto;

	private boolean emVoo = false;

	public Aviao(String nomeVoo, Aeroporto aeroporto) {
		this.nomeVoo = nomeVoo;
		this.aeroporto = aeroporto;
	}

	@Override
	public void run() {
		this.decolar();
		this.voar();
		this.aterrissar();
	}

	public synchronized void decolar() {
		System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
				+ "] VOO " + this.nomeVoo + " AGUARDANDO PISTA PARA DECOLAGEM");
		this.aeroporto.isPistaDisponivel();
		System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
				+ "] VOO " + this.nomeVoo + " DECOLANDO");
		this.aeroporto.setPistaDisponivel(false);
	}

	public synchronized void voar() {
		try {
			this.emVoo = true;
			sleep(2 * 1000l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void aterrissar() {
		System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
				+ "] VOO " + this.nomeVoo + " AGUARDANDO PISTA PARA POUSO");
		this.aeroporto.isPistaDisponivel();
		System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
				+ "] VOO " + this.nomeVoo + " POUSANDO");
		this.aeroporto.setPistaDisponivel(false);
		this.emVoo = false;
	}

	public String getNomeVoo() {
		return this.nomeVoo;
	}

	public boolean isEmVoo() {
		return this.emVoo;
	}

}
