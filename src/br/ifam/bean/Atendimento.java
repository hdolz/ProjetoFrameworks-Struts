package br.ifam.bean;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
public class Atendimento {

	@JoinColumn(name = "vaccodigo")
	private Vacina vacina;
	@JoinColumn(name = "paccodigo")
	private Paciente paciente;
	@JoinColumn(name = "usucodigo")
	private Usuario usuario;
	
	public Atendimento(Vacina vacina, Paciente paciente, Usuario usuario) {
		this.vacina = vacina;
		this.paciente = paciente;
		this.usuario = usuario;
	}
	
}
