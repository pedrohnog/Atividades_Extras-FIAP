package br.com.fiap.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES", catalog = "DBFiap_Atv2")
@NamedQuery(name = "Clientes.findAll", query = "select c from Clientes c")
public class Clientes implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCLIENTE", unique = true, nullable = false, length = 11)
	private Integer idCliente;

	@Column(name = "NOME", unique = false, nullable = false, length = 45)
	private String nome;

	@Column(name = "EMAIL", unique = true, nullable = false, length = 45)
	private String email;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "idCliente")
	private List<Pedidos> pedidos;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Pedidos> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Clientes [idCliente=").append(idCliente).append(", nome=").append(nome).append(", email=")
				.append(email).append(", pedidos=").append(pedidos).append("]");
		return builder.toString();
	}
}
