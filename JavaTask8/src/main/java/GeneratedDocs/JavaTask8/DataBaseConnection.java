package GeneratedDocs.JavaTask8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
	public Connection getConnection() {
		Connection connection=null;
		System.out.println("Connection called");
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");	
		
	}catch(ClassNotFoundException e) {
	e.printStackTrace();
		
	}catch(SQLException e) {
		e.printStackTrace();
	}	
return connection;
}
}