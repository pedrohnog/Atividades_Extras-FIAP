package br.com.fiap.bean;

public class UsuarioSessaoBean {

	private String primeiroAcesso;
	private String ultimoAcesso;

	public String getPrimeiroAcesso() {
		return primeiroAcesso;
	}

	public void setPrimeiroAcesso(String primeiroAcesso) {
		this.primeiroAcesso = primeiroAcesso;
	}

	public String getUltimoAcesso() {
		return ultimoAcesso;
	}

	public void setUltimoAcesso(String ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}

}
