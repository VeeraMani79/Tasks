package CrudOperation.JavaTask6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {

	public static void main(String [] args) throws SQLException {
		
		//1)first create  connection to data base
				Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","root");
				//2)create statement  write on query
				
				Statement statement=connection.createStatement();
		
		//String s="INSERT INTO bike_information VALUES(6,'R15',70000,'SkyBlue')";  //insert add one data
		  String s="UPDATE bike_information SET bike_price=2500000 where id=5";     //update add one data
		//String s="DELETE FROM bike_information where id=6";  //delete one data
		
		//String s="select * FROM city";
		//3)execute the statement query and store data and result data
	statement.execute(s);
		// ResultSet rs=statement.executeQuery(s);
//		 while(rs.next()) {
//			 int id= rs.getInt("ID");
//			 String name=rs.getString("Name");
//			 String code=rs.getString("CountryCode");
//			 String district=rs.getString("District");
//			 int pop=rs.getInt("Population");
//			 
//			 
//			 
//				System.out.println(id+"   "+name+"   "+code+"   "+district+"   "+pop);
//		 }
//		
		//4)closed connection
		connection.close();
	
				
				System.out.println("Query Executed");	
	}
	
	
}
