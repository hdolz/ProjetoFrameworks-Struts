package br.strutsweb.controller;

import com.opensymphony.xwork2.ActionSupport;

import br.strutsweb.bean.Usuario;

public class UsuarioController extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario bean; 
	
	public UsuarioController() {
		bean = new Usuario();
	}
	
	@Override
	public String execute() {
		return null;
	}
	
	public String add() {
		return null;
	}
	
	public String remove() {
		return null;
	}
	
	public String list() {
		return null;
	}
	
	public String find() {
		return null;
	}
}
