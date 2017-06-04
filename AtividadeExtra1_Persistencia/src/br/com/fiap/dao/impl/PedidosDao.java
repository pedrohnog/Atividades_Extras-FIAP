package br.com.fiap.dao.impl;

import br.com.fiap.dao.Dao;
import br.com.fiap.entity.Pedidos;

public class PedidosDao extends Dao {
	
	public void incluirPedido(Pedidos pedido) {
		String query = "INSERT INTO PEDIDOS (idcliente, data, descricao, valor) VALUES (?, ?, ?, ?)";
		
		try {
			super.abrirConexao();
			
			super.stmt = super.cn.prepareStatement(query);
			
			super.stmt.setInt(1, pedido.getIdCliente());
			super.stmt.setDate(2, pedido.getData());
			super.stmt.setString(3, pedido.getDescricao());
			super.stmt.setDouble(4, pedido.getValor());
			
			super.stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Pedidos buscarPedido(int id) {
		String query = "SELECT * FROM PEDIDOS WHERE IDPEDIDO = ?";
		Pedidos pedidos = new Pedidos();
		
		try {
			super.abrirConexao();
			
			super.stmt = super.cn.prepareStatement(query);
			
			super.stmt.setInt(1, id);
			
			super.rs = super.stmt.executeQuery();
			
			if(super.rs.next()) {
				pedidos.setId(super.rs.getInt("IDPEDIDO"));
				pedidos.setIdCliente(super.rs.getInt("IDCLIENTE"));
				pedidos.setData(super.rs.getDate("DATA"));
				pedidos.setDescricao(super.rs.getString("DESCRICAO"));
				pedidos.setValor(super.rs.getDouble("VALOR"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return pedidos;
	}

}
