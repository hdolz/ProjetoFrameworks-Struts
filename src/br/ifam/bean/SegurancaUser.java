package br.ifam.bean;

import javax.persistence.Embeddable;

@Embeddable 
public class SegurancaUser {

	private String login;
	private String senha;

	public SegurancaUser(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
}
