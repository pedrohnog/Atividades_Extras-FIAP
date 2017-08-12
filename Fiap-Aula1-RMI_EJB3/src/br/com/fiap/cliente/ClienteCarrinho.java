package br.com.fiap.cliente;

import java.rmi.Naming;

import br.com.fiap.rmi.Carrinho;
import br.com.fiap.rmi.Item;

public class ClienteCarrinho {

	public static void main(String[] args) throws Exception {
		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://localhost:1099/farmacia/carrinho");

		Item item1 = new Item();
		item1.setNome("ITEM e DO CARRINHO");
		item1.setPreco(7.0);

		Item item2 = new Item();
		item2.setNome("ITEM 4 DO CARRINHO");
		item2.setPreco(9.0);

		carrinho.cadastrarItem(item1);
		carrinho.cadastrarItem(item2);
		System.out.println(carrinho.obterQuantidadeItens());
	}

}
