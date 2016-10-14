package br.projetodemojdbc.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.projetodemojdbc.app.Resource;

public class ConnectionFactory {
	
	public Connection getConnection() throws SQLException{
		
		Connection result = DriverManager.getConnection(Resource.getDbUrl(),Resource.getDbUser(),Resource.getDbPwd());
		
		return result;
	}

}
