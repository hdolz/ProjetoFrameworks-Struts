package br.strutsweb.bean;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import org.apache.struts.action.ActionForm;

@Entity
public class Atendimento extends ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
