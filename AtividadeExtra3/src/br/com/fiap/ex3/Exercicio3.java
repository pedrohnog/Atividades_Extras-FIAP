package br.com.fiap.ex3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.WeakHashMap;

public class Exercicio3 {

	private static ArrayList<Integer> testeArrayList = new ArrayList<>();
	private static LinkedList<Integer> testeLinkedList = new LinkedList<>();

	private static Stack<Integer> testeStack = new Stack<>();
	private static HashSet<Integer> testeHashSet = new HashSet<>();

	private static HashMap<Integer, Integer> testeHashMap = new HashMap<>();
	private static WeakHashMap<Integer, Integer> testeWeakHashMap = new WeakHashMap<>();

	private static final int QTDE_ITENS = 1_000_000;
	private static final int INDICE_BUSCA = 500_000;

	public static void main(String[] args) {
		long tempoA = testarItemA();
		long tempoB = testarItemB();
		long tempoC = testarItemC();

		System.out.println("A: " + tempoA);
		System.out.println("B: " + tempoB);
		System.out.println("C: " + tempoC);

		long menorTempo = Math.min(tempoA, Math.min(tempoB, tempoC));
		
		if(menorTempo == tempoA) {
			System.out.println("Os melhores tipos são ArrayList e LinkedList");
		} else if(menorTempo == tempoB) {
			System.out.println("Os melhores tipos são Stack e HashSet");
		} else {
			System.out.println("Os melhores tipos são HashMap e WeakHashMap");
		}

	}

	public static long testarItemA() {
		LocalDateTime inicio = LocalDateTime.now();

		for (int i = 1; i <= QTDE_ITENS; i++) {
			testeArrayList.add(i);
			testeLinkedList.add(i);
		}

		testeArrayList.get(INDICE_BUSCA);
		testeLinkedList.get(INDICE_BUSCA);

		LocalDateTime fim = LocalDateTime.now();

		return ChronoUnit.MILLIS.between(inicio, fim);
	}

	private static long testarItemB() {
		LocalDateTime inicio = LocalDateTime.now();

		for (int i = 1; i <= QTDE_ITENS; i++) {
			testeStack.push(i);
			testeHashSet.add(i);
		}

		for (int i = 1; i <= INDICE_BUSCA; i++) {
			testeStack.pop();
		}

		for (Integer valor : testeHashSet) {
			if (valor.equals(INDICE_BUSCA)) {
				break;
			}
		}

		LocalDateTime fim = LocalDateTime.now();

		return ChronoUnit.MILLIS.between(inicio, fim);
	}

	private static long testarItemC() {
		LocalDateTime inicio = LocalDateTime.now();

		for (int i = 1; i <= QTDE_ITENS; i++) {
			testeHashMap.put(i, i);
			testeWeakHashMap.put(i, i);
		}

		testeHashMap.get(INDICE_BUSCA);
		testeWeakHashMap.get(INDICE_BUSCA);

		LocalDateTime fim = LocalDateTime.now();

		return ChronoUnit.MILLIS.between(inicio, fim);
	}

}
