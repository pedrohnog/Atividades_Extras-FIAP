package br.com.fiap.ex4;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio4 {
	
	private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
	
	public static void main(String[] args) {
		Exercicio4 ex4 = new Exercicio4();
		ex4.popularPessoa();
		ex4.sortearRemover();
		ex4.ordenarPorNome();
		ex4.inverterOrdemPorNome();
	}
	
	private void popularPessoa() {
		Pessoa pessoa1 = new Pessoa("João Garcia", 20, 'M', "AIK Enterprises");
		Pessoa pessoa2 = new Pessoa("Maria Martins", 44, 'F', "Simples");
		Pessoa pessoa3 = new Pessoa("Henrique Fernando", 43, 'M', "AIK Enterprises");
		Pessoa pessoa4 = new Pessoa("Inácio Luís", 33, 'M', "Magazine André");
		Pessoa pessoa5 = new Pessoa("Fernando Ferreira", 87, 'M', "Casas Recife");
		
		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		listaPessoas.add(pessoa4);
		listaPessoas.add(pessoa5);
	}
	
	private void sortearRemover() {
		System.out.println("SORTEAR E REMOVER");
		System.out.println("ANTES: ");
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
		
		listaPessoas.remove((int) (Math.random() * 5));
		
		System.out.println("DEPOIS: ");
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	private void ordenarPorNome() {
		System.out.println("ORDENAÇÃO POR NOME");
		System.out.println("ANTES: ");
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
		
		Collections.sort(listaPessoas,(u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		
		System.out.println("DEPOIS: ");
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	private void inverterOrdemPorNome() {
		System.out.println("INVERTER ORDENAÇÃO POR NOME");
		System.out.println("ANTES: ");
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
		
		Collections.sort(listaPessoas,(u1, u2) -> u2.getNome().compareTo(u1.getNome()));
		
		System.out.println("DEPOIS: ");
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
}
