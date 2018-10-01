package br.strutsweb.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import br.strutsweb.util.ETipoUsuario;

@Entity
public class SegurancaUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
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
		
	public SegurancaUser() {
		// TODO Auto-generated constructor stub
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
