package br.com.fiap.ex2;

public class Main {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EquipamentoEletronico tablet = new Tablet();
		EquipamentoEletronico smartphone = new Smartphone();
		Equipamento equipamento = new Equipamento();
		Object objeto = new Object();
		Movel movel = new Movel();
		Tablet tablet2 = new Tablet();
		Smartphone smartphone2 = new Smartphone();
		
		objeto = equipamento;
		objeto = movel;
		equipamento = tablet2;
		equipamento=smartphone2;
		smartphone=tablet;
//		smartphone2=tablet2;
		equipamento=(Equipamento) tablet;
		movel=(Movel) tablet;
		tablet=(EquipamentoEletronico) equipamento;
	}
	
}
