package br.projetodemojdbc.dao;

import java.util.List;

public interface IAlunoDao<T> extends IDao<T>{
	List<T> listByCurso(String curso) throws Exception;
}
