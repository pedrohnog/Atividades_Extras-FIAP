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
		
		this.decolar();
	}
	
	public void decolar() {
		System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S")) + "] VOO " + this.nomeVoo + " AGUARDANDO PISTA PARA DECOLAGEM");
		if(this.aeroporto.isPistaDisponivel()) {
			System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S")) + "] VOO " + this.nomeVoo + " DECOLANDO");
			this.voar();
			this.aeroporto.setPistaDisponivel(false);
		}
	}
	
	public void voar() {
		try {
			this.emVoo = true;
			sleep(2 * 1000l);
			this.aterrissar();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void aterrissar() {
		System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S")) + "] VOO " + this.nomeVoo + " AGUARDANDO PISTA PARA POUSO");
		if(this.aeroporto.isPistaDisponivel()) {
			System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.S"))
					+ "] VOO " + this.nomeVoo + " POUSANDO");
			this.aeroporto.setPistaDisponivel(false);
			this.emVoo = false;
		}
	}

	public String getNomeVoo() {
		return this.nomeVoo;
	}

	public boolean isEmVoo() {
		return this.emVoo;
	}

}
