package br.com.fiap.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDOS", catalog = "DBFiap_Atv2")
@NamedQuery(name = "Pedidos.findAll", query = "select p from Pedidos p")
public class Pedidos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPEDIDO", unique = true, nullable = false, length = 11)
	private Integer idPedido;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDCLIENTE")
	private Clientes idCliente;

	@Column(name = "DATA", unique = false, nullable = false)
	private LocalDateTime data;

	@Column(name = "DESCRICAO", unique = false, nullable = false, length = 45)
	private String descricao;

	@Column(name = "VALOR", unique = false, nullable = false)
	private Double valor;

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Clientes getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Clientes idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedidos [idPedido=").append(idPedido).append(", idCliente=").append(idCliente).append(", data=")
				.append(data).append(", descricao=").append(descricao).append(", valor=").append(valor).append("]");
		return builder.toString();
	}

}
