package br.strutsweb.dao;

import java.util.List;
import org.hibernate.Session;
import br.strutsweb.bean.SegurancaUser;
import br.strutsweb.util.ConnectionFactory;
import br.strutsweb.util.IinsertDAO;

public class SegurancaUserDAO implements IinsertDAO<SegurancaUser>{

	private Session session;

	public SegurancaUserDAO() {
		session = ConnectionFactory.getSessionFactory().openSession();
	}
	
	
	public String salvar(SegurancaUser dao) {
//		try {
//			session.beginTransaction();
//			session.persist(dao);
//			session.getTransaction().commit();
//			return "Senha e Login cadastro com sucesso!";
//		}catch (Exception e) {
//			session.getTransaction().rollback();
//			System.err.println("Error -> "+e.getMessage());
//		}
		return null;
	}

	
	public String excluir(SegurancaUser dao) {
//		try {
//			System.out.println("Excluindo a senha e login.");
//			session.beginTransaction();
//			SegurancaUser bean = this.item(dao);
//			session.remove(bean);      
//			session.getTransaction().commit();
//			return "Login e senha excluido com sucesso!";
//		} catch(Exception e){
//			session.getTransaction().rollback();
//		}
		return "Erro ao excluir a usuario"+dao.getLogin()+"!!";
	}

	
	public List<SegurancaUser> listar(SegurancaUser dao) {
//		List<SegurancaUser> lista = null;
//		try {
//			//monta consulta        
//			Query query = session.createQuery("FROM SegurancaUser "
//					+ "where Llogin LIKE :nome");
//			query.setParameter("nome", "%"+dao.getLogin()+"%");
//
//			lista = query.getResultList();
//
//		} catch(Exception e){
//			session.getTransaction().rollback();
//		}
		return null;//lista;
	}

	
	public SegurancaUser item(SegurancaUser dao) {
//		SegurancaUser bean = null;
//		try {
//			//Consulta curso pelo id
//			session.beginTransaction();
//			bean = session.find(SegurancaUser.class, dao.getLogin());
//			session.getTransaction().commit();
//		} catch(Exception e){
//			session.getTransaction().rollback();
//		}
		return null;//bean;
	}

}
