package City.JavaTask4;

import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Products {
	public static void main(String [] args) throws SQLException, IOException {
		
		//database connection
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/plasticitems","root","root");
		Statement statement=connection.createStatement();
		

		//create a new table in the database 
		
		String sql ="create table places1(ID int(5),ItemName varchar(20),ItemColor varchar(20),ItemPrice int(10))";
		statement.execute(sql);
		
		//excel
		
		FileInputStream file= new FileInputStream("C:\\ExcelToDb\\ExcelToDatBase.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook (file);
		XSSFSheet sheet =wb.getSheet("Location Data");
		
		int rows=sheet.getLastRowNum();
		for(int i=1;i<=rows;i++) {
			
			XSSFRow row=sheet.getRow(i);
			int id= (int)row.getCell(0).getNumericCellValue();
			String itemName=row.getCell(1).getStringCellValue();
			String itemColor=row.getCell(2).getStringCellValue();
		    int itemPrice= (int)row.getCell(3).getNumericCellValue();
			
			
			sql="insert into places1 values ('"+id+"', '"+itemName+"', '"+itemColor+"', '"+itemPrice+"')";
			statement.execute(sql);
			statement.execute("commit");
			
		}
		wb.close();
		file.close();
		connection.close();
		
		System.out.println("Save");
		
		
	}

}
