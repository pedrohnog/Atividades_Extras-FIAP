package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Dao {

	protected Connection cn;
	protected PreparedStatement stmt;
	protected ResultSet rs;

	private String url = "jdbc:mysql://localhost/vendas";

	protected void abrirConexao() throws Exception {
		this.cn = DriverManager.getConnection(this.url, "fiap", "fiap");
	}

	protected void fecharConexao() {
		if (this.rs != null) {
			try {
				this.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (this.stmt != null) {
			try {
				this.stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (this.cn != null) {
			try {
				this.cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
