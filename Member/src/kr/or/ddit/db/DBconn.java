package kr.or.ddit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		if(conn==null) {
			String url = "jdbc:oracle:thin:@localhost:1588/FREEPDB1";
			String user = "css02";
			String pass = "java";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, pass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
			
			
		}
		return conn;
	}
}	
