package br.strutsweb.controller;

import com.opensymphony.xwork2.ActionSupport;

import br.strutsweb.bean.SegurancaUser;
import br.strutsweb.dao.SegurancaUserDAO;

public class Login extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private SegurancaUserDAO dao;
	private SegurancaUser user;
	
	public Login() {
		user = new SegurancaUser();
		dao = new SegurancaUserDAO();
	}
	@Override
	public String execute() throws Exception {		
		return "LOGIN";
	}
	
	public String validar() {
		System.out.println(getUser().getLogin());
		try {
			if(dao.item(getUser()) != null) {			
				return "success";
			}else
				return "error";
		}catch (Exception e) {
			System.out.println(e);
			return "error";
		}
	}
	
	public String addUser() {
		return "success";
	}
	
	public String removeUser() {
		return "success";
	}
	
	public String updateUser() {
		return "success";
	}
	public SegurancaUser getUser() {
		return user;
	}
	public void setUser(SegurancaUser user) {
		this.user = user;
	}
	
}
