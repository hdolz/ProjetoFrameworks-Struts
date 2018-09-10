package br.strutsweb.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.apache.struts.action.ActionForm;

@Embeddable 
public class SegurancaUser extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String login;
	private String senha;
	@Enumerated(EnumType.STRING)
	@Column(name="TipoUsuario")
	private ETipoUsuario tipo;
	@OneToOne
	@JoinColumn(name = "usucodigo")
	private Usuario usuario;

	public SegurancaUser(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
		
	public ETipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(ETipoUsuario tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
