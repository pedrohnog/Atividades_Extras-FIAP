package br.com.fiap.model;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.struts.Pessoa;

public class Controle {
	
	private static List<Pessoa> cadastros;
	
	static {
		cadastros = new ArrayList<>();
	}
	
	public static void adicionarRegistro(Pessoa pessoa) {
		cadastros.add(pessoa);
	}
	
	public static List<Pessoa> lerRegistros() {
		return cadastros;
	}

}
