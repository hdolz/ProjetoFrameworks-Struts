package br.strutsweb.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

import br.strutsweb.bean.SegurancaUser;
import br.strutsweb.util.ConnectionFactory;
import br.strutsweb.util.IinsertDAO;

public class SegurancaUserDAO implements IinsertDAO<SegurancaUser> {

	private Session session;

	public SegurancaUserDAO() {
		session = ConnectionFactory.getSessionFactory().openSession();
	}

	public String salvar(SegurancaUser dao) {
//		try {
//			session = ConnectionFactory.getSessionFactory().openSession();
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
		return "Erro ao excluir a usuario" + dao.getLogin() + "!!";
	}

	public List<SegurancaUser> listar(SegurancaUser dao) {
		List<SegurancaUser> lista = null;
		try {
			session.beginTransaction();
			lista = session.createCriteria(SegurancaUser.class).list();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
		session.flush();
		session.clear();
		return lista;
	}

	@Override
	public SegurancaUser item(SegurancaUser dao) {
		List<SegurancaUser> list = null;
		String hql = "FROM SegurancaUser WHERE login = ? and senha = ?";

		try {
			session.beginTransaction();
			 query = ;
			query.setParameter(0, dao.getLogin());
			query.setParameter(1, dao.getSenha());
			list = query.list();
		} catch (Exception e) {
			System.out.println(e);
		}
		session.getTransaction().commit();
		session.flush();
		session.close();
		return list.get(0);
	}

}
