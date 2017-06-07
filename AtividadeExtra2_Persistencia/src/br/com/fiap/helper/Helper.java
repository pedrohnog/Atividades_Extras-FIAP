package br.com.fiap.helper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Pedidos;

public class Helper implements AutoCloseable {

	private EntityManagerFactory emf;
	private EntityManager em;

	public Helper() {
		this.emf = Persistence.createEntityManagerFactory("AtividadeExtra2_Persistencia");
		this.em = emf.createEntityManager();
	}

	@Override
	public void close() throws Exception {
		em.close();
		emf.close();
	}

	public void criarNovoCliente(Clientes cliente) {
		this.em.getTransaction().begin();
		this.em.persist(cliente);
		this.em.getTransaction().commit();
	}

	public Clientes buscarCliente(Integer id) {
		TypedQuery<Clientes> query = em.createQuery("select c from Clientes c where IDCLIENTE=" + id, Clientes.class);
		return query.getSingleResult();
	}

	public List<Clientes> listarClientes() {
		TypedQuery<Clientes> query = em.createQuery("select c from Clientes c", Clientes.class);
		return query.getResultList();
	}

	public List<Pedidos> listarPedidos() {
		TypedQuery<Pedidos> query = em.createQuery("select p from Pedidos p", Pedidos.class);
		return query.getResultList();
	}
}