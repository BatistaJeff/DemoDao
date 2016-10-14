package br.projetodemojdbc.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import br.projetodemojdbc.model.Cliente;
import br.projetodemojdbc.dao.IClienteDao;

public class ClienteDao implements IClienteDao<Cliente> {
	
	private final String SQL_INSERT = "insert into clientes(nome) values(?)";
	
	private final String SQL_UPDATE = "update clientes set nome=? where id=?";
	
	private final String SQL_DELETE = "delete from clientes where id=?";
	
	private final String SQL_SELECT_BY_ID = "select * from clientes where id=?";
	
	private final String SQL_SELECT_ALL = "select * from clientes";
	
	private Connection conn;
	
	
	public ClienteDao(Connection conn) {
		this.conn = conn;
	}
	@Override
	public void insert(Cliente model) throws Exception {
		PreparedStatement ps = conn.prepareStatement(SQL_INSERT);
		ps.setString(1, model.getNome());
		ps.execute();
		ps.close();		
	}
	
	public void update(Cliente model) throws Exception {
		PreparedStatement ps = conn.prepareStatement(SQL_UPDATE);
		ps.setString(1, model.getNome());
		ps.setInt(2, model.getId());
		ps.execute();
		ps.close();
	}

	public void delete(Object id) throws Exception {
		PreparedStatement ps = conn.prepareStatement(SQL_DELETE);
		ps.setInt(1, (Integer) id);
		ps.execute();
		ps.close();
	}

	public Cliente get(Object id) throws Exception {
		PreparedStatement ps = conn.prepareStatement(SQL_SELECT_BY_ID);
		ps.setInt(1, (Integer) id);
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> list() throws Exception {
		PreparedStatement ps = conn.prepareStatement(SQL_SELECT_ALL);

		return (List<Cliente>) ps.executeQuery();
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
	
	public Connection getConn() {
		return conn;
	}

}
