package Vehicles.Task3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CityPopulations {
	public static void main(String[] args) throws SQLException, IOException {
		// first connect to data base
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		// start write on query

		Statement statment = connection.createStatement();
		ResultSet rs = statment.executeQuery("SELECT * FROM city");

		// Create Excel sheet

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("StudentsInformations");

		XSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Name");
		row.createCell(2).setCellValue("CountryCode");
		row.createCell(3).setCellValue("District");
		row.createCell(4).setCellValue("Population");
		int r = 1;
		while (rs.next()) {
			int id = rs.getInt("ID");
			String name = rs.getString("Name");
			String country = rs.getString("CountryCode");
			String district = rs.getString("District");
			int pop = rs.getInt("Population");

			row = sheet.createRow(r++);

			row.createCell(0).setCellValue(id);
			row.createCell(1).setCellValue(name);
			row.createCell(2).setCellValue(country);
			row.createCell(3).setCellValue(district);
			row.createCell(4).setCellValue(pop);

		}

		FileOutputStream fos = new FileOutputStream("C:\\DatabaseExcelTask\\city.xlsx");
		wb.write(fos);

		wb.close();
		fos.close();
		connection.close();

		System.out.println("Completed");
	}

}
