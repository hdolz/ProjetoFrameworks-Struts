package br.strutsweb.dao;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import br.strutsweb.bean.Usuario;
import br.strutsweb.util.ConnectionFactory;
import br.strutsweb.util.IinsertDAO;

public class UsuarioDAO implements IinsertDAO<Usuario>{

	private Session session;

	public UsuarioDAO() {
		this.session = ConnectionFactory.getSessionFactory().getCurrentSession();
	}
	
	
	public String salvar(Usuario dao) {
		try {
			session.beginTransaction();
			session.persist(dao);
			session.getTransaction().commit();
			return "Usuario cadastra com sucesso!";
		}catch (Exception e) {
			session.getTransaction().rollback();
			System.err.println("Error -> "+e.getMessage());
		}
		return null;
	}

	
	public String excluir(Usuario dao) {
		try {
			System.out.println("Excluindo a usuario.");
			session.beginTransaction();
			session.remove(dao);      
			session.getTransaction().commit();
			return "Usuario excluido com sucesso!";
		} catch(Exception e){
			session.getTransaction().rollback();
		}
		return "Erro ao excluir a usuario"+dao.getCodigo()+"!!";
	}

	
	public List<Usuario> listar(Usuario dao) {
		List<Usuario> lista = null;
		try {
			//monta consulta        
			Query query = session.createQuery("FROM Usuario "
					+ "where usucodigo = :codigo "
					+ "and nome LIKE :nome"
					+ "order by nome");
			query.setParameter("codigo", dao.getCodigo());
			query.setParameter("nome", "%"+dao.getNome()+"%");

			lista = query.getResultList();

		} catch(Exception e){
			session.getTransaction().rollback();
		}
		return lista;
	}

	
	public Usuario item(Usuario dao) {
		Usuario usuario = null;
		try {
			//Consulta curso pelo id
			usuario = session.find(Usuario.class, dao.getCodigo());
		} catch(Exception e){
			session.getTransaction().rollback();
		}
		return usuario;
	}

}
