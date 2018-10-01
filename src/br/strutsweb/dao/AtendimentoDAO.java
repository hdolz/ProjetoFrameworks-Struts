package br.strutsweb.dao;

import java.util.List;
import javax.persistence.Query;

import org.hibernate.Session;

import br.strutsweb.bean.Atendimento;
import br.strutsweb.util.ConnectionFactory;
import br.strutsweb.util.IinsertDAO;

public class AtendimentoDAO extends ConnectionFactory  implements IinsertDAO<Atendimento> {

	private final Session session;
	
	public AtendimentoDAO() {
		this.session = ConnectionFactory.getSessionFactory().getCurrentSession();
	}
	
	public String salvar(Atendimento dao) {
		try {
			session.beginTransaction();
			session.save(dao);
			session.getTransaction().commit();
			return "Atendimento cadastra com sucesso!";
		}catch (Exception e) {
			session.getTransaction().rollback();
			System.err.println("Error -> "+e.getMessage());
		}
		return null;
	}

	public String excluir(Atendimento dao) {
		try {
			System.out.println("Excluindo a curso.");
			session.beginTransaction();
			session.remove(dao);      
			session.getTransaction().commit();
			return "Atendimento excluido com sucesso!";
		} catch(Exception e){
			session.getTransaction().rollback();
		}
		return "Erro ao excluir o atendimento!!";
	}

	public List<Atendimento> listar(Atendimento dao) {
		List<Atendimento> listaCursos = null;
		session.beginTransaction();
		try {
			//monta consulta        
			Query query = session.createQuery("FROM Atendimento");
			listaCursos = query.getResultList();
			session.getTransaction().commit();
		} catch(Exception e){
			session.getTransaction().rollback();
		}
		return listaCursos;
	}

	public Atendimento item(Atendimento dao) {
		Atendimento atendimento = null;
		try {
			//Consulta curso pelo id
			atendimento = session.find(Atendimento.class, dao.getCodigo());
		} catch(Exception e){
			session.getTransaction().rollback();
		}
		return atendimento;
	}
}
