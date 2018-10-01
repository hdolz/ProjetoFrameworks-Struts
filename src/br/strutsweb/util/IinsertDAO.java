package br.strutsweb.util;

import java.util.List;

public interface IinsertDAO<T> {

	public String salvar(T dao);
	public String excluir(T dao);
	public List<T> listar(T dao);
	public T item(T dao);
}
