package br.strutsweb.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import org.apache.struts.action.ActionForm;

@Entity
public class Atendimento extends ActionForm{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;
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
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public long getVacina() {
		return vacina.getCodigo();
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}

	public long getPaciente() {
		return paciente.getNumSUS();
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public long getUsuario() {
		return usuario.getCodigo();
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
