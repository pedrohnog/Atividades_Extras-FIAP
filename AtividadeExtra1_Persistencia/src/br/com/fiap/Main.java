package br.com.fiap;

import java.sql.Date;

import br.com.fiap.dao.impl.ClientesDao;
import br.com.fiap.dao.impl.PedidosDao;
import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Pedidos;

public class Main {
	
	public static void main(String[] args) {
		Clientes cliente = new Clientes();
		
		cliente.setNome("CLIENTE 1");
		cliente.setEmail("cliente1@cliente.com.br");
		
		ClientesDao clientesDao = new ClientesDao();
		
		clientesDao.incluirCliente(cliente);
		
		Pedidos pedido1 = new Pedidos();
		
		pedido1.setIdCliente(1);
		pedido1.setDescricao("TESTE 1");
		pedido1.setData(new Date(new java.util.Date().getTime()));
		pedido1.setValor(10d);
		
		Pedidos pedido2 = new Pedidos();
		
		pedido2.setIdCliente(1);
		pedido2.setDescricao("TESTE 2");
		pedido2.setData(new Date(new java.util.Date().getTime()));
		pedido2.setValor(20d);
		
		PedidosDao pedidosDao = new PedidosDao();
		
		pedidosDao.incluirPedido(pedido1);
		pedidosDao.incluirPedido(pedido2);
		
		System.out.println(clientesDao.buscarCliente(1));
		System.out.println(pedidosDao.buscarPedido(1));
		System.out.println(pedidosDao.buscarPedido(2));
	}

}
