package br.strutsweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.strutsweb.bean.SegurancaUser;
import br.strutsweb.bean.Usuario;

public class SegurancaUserDAO implements IinsertDAO<SegurancaUser>{

	private final EntityManager entityManager;

	public SegurancaUserDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public String salvar(SegurancaUser dao) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(dao);
			entityManager.getTransaction().commit();
			return "Senha e Login cadastro com sucesso!";
		}catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.err.println("Error -> "+e.getMessage());
		}
		return null;
	}

	@Override
	public String excluir(SegurancaUser dao) {
		try {
			System.out.println("Excluindo a senha e login.");
			entityManager.getTransaction().begin();
			SegurancaUser bean = this.item(dao);
			entityManager.remove(bean);      
			entityManager.getTransaction().commit();
			return "Login e senha excluido com sucesso!";
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return "Erro ao excluir a usuario"+dao.getLogin()+"!!";
	}

	@Override
	public List<SegurancaUser> listar(SegurancaUser dao) {
		List<SegurancaUser> lista = null;
		try {
			//monta consulta        
			Query query = entityManager.createQuery("FROM SegurancaUser "
					+ "where Llogin LIKE :nome");
			query.setParameter("nome", "%"+dao.getLogin()+"%");

			lista = query.getResultList();

		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return lista;
	}

	@Override
	public SegurancaUser item(SegurancaUser dao) {
		SegurancaUser bean = null;
		try {
			//Consulta curso pelo id
			bean = entityManager.find(SegurancaUser.class, dao.getLogin());
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return bean;
	}

}
