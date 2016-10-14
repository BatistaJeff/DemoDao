package br.projetodemojdbc.dao.jdbc;

import java.util.List;

import br.projetodemojdbc.dao.IAlunoDao;
import br.projetodemojdbc.model.Aluno;

public class AlunoDao implements IAlunoDao<Aluno> {
	
	private final String SQL_INSERT = "insert into alunos(ra, nome, curso) values(?,?,?)";
	
	private final String SQL_UPDATE = "update alunos set nome=?, curso=? where ra=?";
	
	private final String SQL_DELETE = "delete from alunos where ra=?";
	
	private final String SQL_SELECT_BY_ID = "select * from alunos where ra=?";
	
	private final String SQL_SELECT_ALL = "select * from alunos";
	
	private final String SQL_SELECT_BY_CURSO = "select * from alunos where curso=?";

	public void insert(Aluno model) throws Exception {
		
	}

	public void update(Aluno model) throws Exception {
		
	}

	public void delete(Object id) throws Exception {
		
	}

	public Aluno get(Object id) throws Exception {
		return null;
	}

	public List<Aluno> list() throws Exception {
		return null;
	}

	public List<Aluno> listByCurso(String curso) throws Exception {
		return null;
	}

	public String getSQL_INSERT() {
		return SQL_INSERT;
	}

	public String getSQL_UPDATE() {
		return SQL_UPDATE;
	}

	public String getSQL_DELETE() {
		return SQL_DELETE;
	}

	public String getSQL_SELECT_BY_ID() {
		return SQL_SELECT_BY_ID;
	}

	public String getSQL_SELECT_ALL() {
		return SQL_SELECT_ALL;
	}

	public String getSQL_SELECT_BY_CURSO() {
		return SQL_SELECT_BY_CURSO;
	}

}
