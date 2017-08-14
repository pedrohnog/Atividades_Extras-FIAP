package br.com.fiap;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CardapioMBean {

	private String nome;
	private Double valor;
	private String tipo;
	
	public String salvar() {
		try (FileWriter fw = new FileWriter("D:\\Temp\\cadastroCardapio.csv", true); PrintWriter out = new PrintWriter(fw);) {
			out.print(nome);
			out.print(",");
			out.print(valor);
			out.print(",");
			out.print(tipo);
			out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		return "index.xhtml";
		return "sucesso?faces-redirect=true";
	}
	
	public TipoPrato[] getTipoPrato() {
		return TipoPrato.values();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
