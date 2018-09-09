package br.ifam.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paciente {

	@Id
	@Column(name="paccodigo")
	private long numSUS;
	private String pressao;
	private double peso;
	private Usuario usuario;
		
	public Paciente(long numSUS, String pressao, double peso, Usuario usuario) {
		super();
		this.numSUS = numSUS;
		this.pressao = pressao;
		this.peso = peso;
		this.usuario = usuario;
	}

	public Paciente(String pressao, double peso) {
		super();
		this.pressao = pressao;
		this.peso = peso;
	}

	public Paciente() {}
	
	public long getNumSUS() {
		return numSUS;
	}
	public void setNumSUS(long numSUS) {
		this.numSUS = numSUS;
	}
	public String getPressao() {
		return pressao;
	}
	public void setPressao(String pressao) {
		this.pressao = pressao;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
