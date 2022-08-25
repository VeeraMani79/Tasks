package Pdf2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	
	public Connection  getConnection() {
		
		Connection connection =null;
		System.out.println("Connection called");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/staff","root","root");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connection;
		
	}
		
		
		
	
	
 
}
