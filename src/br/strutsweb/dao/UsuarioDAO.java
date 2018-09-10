package br.strutsweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.strutsweb.bean.Usuario;
import br.strutsweb.bean.Vacina;

public class UsuarioDAO implements IinsertDAO<Usuario>{

	private final EntityManager entityManager;

	public UsuarioDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public String salvar(Usuario dao) {
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(dao);
			entityManager.getTransaction().commit();
			return "Usuario cadastra com sucesso!";
		}catch (Exception e) {
			entityManager.getTransaction().rollback();
			System.err.println("Error -> "+e.getMessage());
		}
		return null;
	}

	@Override
	public String excluir(Usuario dao) {
		try {
			System.out.println("Excluindo a usuario.");
			entityManager.getTransaction().begin();
			Usuario usuario = this.item(dao);
			entityManager.remove(usuario);      
			entityManager.getTransaction().commit();
			return "Usuario excluido com sucesso!";
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return "Erro ao excluir a usuario"+dao.getCodigo()+"!!";
	}

	@Override
	public List<Usuario> listar(Usuario dao) {
		List<Usuario> lista = null;
		try {
			//monta consulta        
			Query query = entityManager.createQuery("FROM Usuario "
					+ "where usucodigo = :codigo "
					+ "and nome LIKE :nome"
					+ "order by nome");
			query.setParameter("codigo", dao.getCodigo());
			query.setParameter("nome", "%"+dao.getNome()+"%");

			lista = query.getResultList();

		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return lista;
	}

	@Override
	public Usuario item(Usuario dao) {
		Usuario usuario = null;
		try {
			//Consulta curso pelo id
			usuario = entityManager.find(Usuario.class, dao.getCodigo());
		} catch(Exception e){
			entityManager.getTransaction().rollback();
		}
		return usuario;
	}

}
