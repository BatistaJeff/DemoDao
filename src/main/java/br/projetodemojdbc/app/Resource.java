package br.projetodemojdbc.app;

public class Resource {

		public static String getDbUser(){
			return "root";		
		}
		
		public static String getDbPwd(){
			return "root";		
		}
		
		public static String getDbHostname(){
			return "localhost";		
		}

		public static int getDbPort(){
			return 3306;		
		} 
		
		public static String getDbName(){
			return "demodb";		
		}
		
		public static String getDbUrl(){
			String url = "jdbc:mysql://"+getDbHostname()+
					":"+getDbPort() + "/" + getDbName();		
			return url;
		}
	
}
