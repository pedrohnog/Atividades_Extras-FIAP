package br.com.fiap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "aluno")
@XmlAccessorType(XmlAccessType.FIELD)
public class Aluno {

	public String nome;
	public String turma;
	public double media;

	public Aluno() {
		// Construtor padrão
	}

	public Aluno(String nome, String turma, double media) {
		this.nome = nome;
		this.turma = turma;
		this.media = media;
	}

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

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

}
