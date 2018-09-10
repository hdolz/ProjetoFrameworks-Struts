package br.strutsweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.strutsweb.bean.Atendimento;

public class AtendimentoDAO implements IinsertDAO<Atendimento> {

	private final EntityManager entityManager;
	
	public AtendimentoDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public String salvar(Atendimento dao) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(dao);
			entityManager.getTransaction().commit();
			return "Atendimento cadastra com sucesso!";
		}catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.err.println("Error -> "+e.getMessage());
		}
		return null;
	}

	@Override
	public String excluir(Atendimento dao) {
		try {
			System.out.println("Excluindo a curso.");
			entityManager.getTransaction().begin();
			Atendimento atendimento = this.item(dao);
			entityManager.remove(atendimento);      
			entityManager.getTransaction().commit();
			return "Vacina excluido com sucesso!";
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return "Erro ao excluir o atendimento!!";
	}

	@Override
	public List<Atendimento> listar(Atendimento dao) {
		List<Atendimento> listaCursos = null;
		try {
			//monta consulta        
			Query query = entityManager.createQuery("FROM Atendimento");
			listaCursos = query.getResultList();
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return listaCursos;
	}

	@Override
	public Atendimento item(Atendimento dao) {
		Atendimento atendimento = null;
		try {
			//Consulta curso pelo id
			atendimento = entityManager.find(Atendimento.class, dao.getCodigo());
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return atendimento;
	}
}
