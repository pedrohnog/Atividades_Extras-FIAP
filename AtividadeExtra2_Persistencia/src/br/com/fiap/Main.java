package br.com.fiap;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Pedidos;
import br.com.fiap.helper.Helper;

public class Main {

	public static void main(String[] args) {
		Clientes cliente = criarClientes();

		try (Helper helper = new Helper()) {
			helper.criarNovoCliente(cliente);

			System.out.println(helper.buscarCliente(cliente.getIdCliente()));

			helper.listarClientes().forEach(System.out::println);
			helper.listarPedidos().forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static Clientes criarClientes() {
		Clientes clientes = new Clientes();
		clientes.setNome(JOptionPane.showInputDialog("Informe o nome do cliente"));
		clientes.setEmail(JOptionPane.showInputDialog("Informe o email do cliente"));
		clientes.setPedidos(criarPedidos(clientes));
		return clientes;
	}

	private static List<Pedidos> criarPedidos(Clientes cliente) {
		List<Pedidos> pedidos = new ArrayList<>();

		int quantidade;
		try {
			quantidade = Math.abs(Integer.valueOf(JOptionPane.showInputDialog("Informe a quantidade de pedidos")));
		} catch(NumberFormatException e) {
			System.err.println("Quantidade de pedidos inválida");
			throw e;
		}
		
		for (int i = 0; i < quantidade; i++) {
			Pedidos pedido = new Pedidos();
			
			pedido.setData(LocalDateTime.now());
			pedido.setDescricao(JOptionPane.showInputDialog("Informe a descrição do " + (i+1) + "º pedido"));
			
			try {
				pedido.setValor(Math.abs(Double.valueOf(JOptionPane.showInputDialog("Informe o valor do " + (i+1) + "º pedido"))));
			} catch(NumberFormatException e) {
				System.err.println("Valor inválido");
				throw e;
			}
			
			pedidos.add(pedido);
		}

		return pedidos;
	}
}
