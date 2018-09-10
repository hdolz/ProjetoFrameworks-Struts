package br.strutsweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.strutsweb.bean.Vacina;

public class VacinaDAO implements IinsertDAO<Vacina>{

	private EntityManager entityManager;

	public VacinaDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public String salvar(Vacina dao) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(dao);
			entityManager.getTransaction().commit();
			return "Vacina cadastra com sucesso!";
		}catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.err.println("Error -> "+e.getMessage());
		}
		return null;
	}

	@Override
	public String excluir(Vacina dao) {
		try {
			System.out.println("Excluindo a curso.");
			entityManager.getTransaction().begin();
			Vacina curso = this.item(dao);
			entityManager.remove(curso);      
			entityManager.getTransaction().commit();
			return "Vacina excluido com sucesso!";
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return "Erro ao excluir a vacina"+dao.getCodigo()+"!!";
	}

	@Override
	public List<Vacina> listar(Vacina dao) {
		List<Vacina> listaCursos = null;
		try {
			//monta consulta        
			Query query = entityManager.createQuery("FROM Vacina "
					+ "where vaccodigo = :codigo "
					+ "and nome LIKE :nome"
					+ "order by nome");
			query.setParameter("codigo", dao.getCodigo());
			query.setParameter("nome", "%"+dao.getNome()+"%");

			listaCursos = query.getResultList();

		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return listaCursos;
	}

	@Override
	public Vacina item(Vacina dao) {
		Vacina vacina = null;
		try {
			//Consulta curso pelo id
			vacina = entityManager.find(Vacina.class, dao.getCodigo());
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return vacina;
	}
}
