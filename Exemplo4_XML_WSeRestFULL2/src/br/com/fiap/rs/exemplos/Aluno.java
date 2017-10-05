package br.com.fiap.rs.exemplos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aluno {

	private String nome;
	private String turma;
	private Double media;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

}
