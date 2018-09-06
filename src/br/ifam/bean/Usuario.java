package br.ifam.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario {

	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private String nome;
	private String email;
	private String rg;
	private String cpf;
	@Temporal (TemporalType.DATE)
	private Date dtNascimento;
	@Temporal (TemporalType.TIMESTAMP)
	private Date dtCadastro;
	private SegurancaUser user;
	@Enumerated(EnumType.STRING)
	@Column(name="TipoUsuario")
	private ETipoUsuario tipo;
	
	public Usuario() {
	
	}
	
	public Usuario(String nome, String email, String rg, String cpf, Date dtNascimento, Date dtCadastro, String login, String senha) {
		this.nome = nome;
		this.email = email;
		this.rg = rg;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.dtCadastro = dtCadastro;
		this.user = new SegurancaUser(login, senha);
	}
		
	public SegurancaUser getUser() {
		return user;
	}

	public void setUser(SegurancaUser user) {
		this.user = user;
	}

	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public Date getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
}
