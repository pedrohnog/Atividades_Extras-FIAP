package br.com.fiap.entity;

import java.io.Serializable;
import java.sql.Date;

public class Pedidos implements Serializable {

	private static final long serialVersionUID = -1929055711648799211L;
	
	private int id;
	private int idCliente;
	private Date data;
	private String descricao;
	private double valor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedidos [id=").append(id).append(", idCliente=").append(idCliente).append(", data=")
				.append(data).append(", descricao=").append(descricao).append(", valor=").append(valor).append("]");
		return builder.toString();
	}

}
