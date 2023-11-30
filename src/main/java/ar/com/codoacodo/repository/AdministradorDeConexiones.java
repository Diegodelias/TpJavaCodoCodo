package ar.com.codoacodo.repository;
import java.sql.Connection;
import java.sql.DriverManager;
public class AdministradorDeConexiones {
	

		public static Connection getConnection() {
			String username = "root";
			String password = "123456";
			String port = "33060";
			String host = "localhost";
			String dbName = "";
			
			String driverName = "com.mysql.cj.jdbc.Driver";
			
			String dbUrl = "jdbc:mysql://"+host+":"+port+"/"+dbName + "?serverTimeZone=UTC&useSSL=false";
				
		
			try {
				Class.forName(driverName);
				return DriverManager.getConnection(dbUrl, username, password);
			}catch(Exception e) {
				throw new IllegalArgumentException("No se pudo conectar a la db: " + dbUrl);
			}
		}

}
