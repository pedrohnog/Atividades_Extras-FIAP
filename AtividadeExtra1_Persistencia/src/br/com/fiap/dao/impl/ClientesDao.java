package br.com.fiap.dao.impl;

import br.com.fiap.dao.Dao;
import br.com.fiap.entity.Clientes;

public class ClientesDao extends Dao {
	
	public void incluirCliente(Clientes cliente) {
		String query = "INSERT INTO CLIENTES (nome, email) VALUES (?, ?)";
		
		try {
			super.abrirConexao();
			
			super.stmt = super.cn.prepareStatement(query);
			
			super.stmt.setString(1, cliente.getNome());
			super.stmt.setString(2, cliente.getEmail());
			
			super.stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			super.fecharConexao();
		}
		
	}
	
	public Clientes buscarCliente(int id) {
		String query = "SELECT * FROM CLIENTES WHERE IDCLIENTE = ?";
		Clientes clientes = new Clientes();
		
		try {
			super.abrirConexao();
			
			super.stmt = super.cn.prepareStatement(query);
			
			super.stmt.setInt(1, id);
			
			super.rs = super.stmt.executeQuery();
			
			if(super.rs.next()) {
				clientes.setId(super.rs.getInt("IDCLIENTE"));
				clientes.setNome(super.rs.getString("NOME"));
				clientes.setEmail(super.rs.getString("EMAIL"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			super.fecharConexao();
		}
		
		return clientes;
	}

}
