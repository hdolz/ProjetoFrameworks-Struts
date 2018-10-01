package br.strutsweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.strutsweb.bean.Paciente;
import br.strutsweb.util.IinsertDAO;

public class PacienteDAO implements IinsertDAO<Paciente>{

	private final EntityManager entityManager;

	public PacienteDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public String salvar(Paciente dao) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(dao);
			entityManager.getTransaction().commit();
			return "Paciente cadastra com sucesso!";
		}catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.err.println("Error -> "+e.getMessage());
		}
		return null;
	}

	public String excluir(Paciente dao) {
		try {
			System.out.println("Excluindo a curso.");
			entityManager.getTransaction().begin();
			Paciente curso = this.item(dao);
			entityManager.remove(curso);      
			entityManager.getTransaction().commit();
			return "Vacina excluido com sucesso!";
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return "Erro ao excluir a vacina"+dao.getNumSUS()+"!!";
	}

	public List<Paciente> listar(Paciente dao) {
		List<Paciente> listaCursos = null;
		try {
			//monta consulta        
			Query query = entityManager.createQuery("FROM Paciente "
					+ "where paccodigo = :codigo "
					+ "and nome LIKE :nome"
					+ "order by nome");
			query.setParameter("codigo", dao.getNumSUS());
			query.setParameter("nome", "%"+dao.getUsuario().getNome()+"%");

			listaCursos = query.getResultList();

		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return listaCursos;
	}

	public Paciente item(Paciente dao) {
		Paciente paciente = null;
		try {
			//Consulta curso pelo id
			paciente = entityManager.find(Paciente.class, dao.getNumSUS());
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return paciente;
	}

}
