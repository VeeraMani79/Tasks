package Employee.Java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UseEmployee {
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.setEmpName("Veera");
		emp1.setEmpId(615);
		emp1.setEmpSalary(30000);
		
		Employee emp2=new Employee();
		emp2.setEmpName("Mani");
		emp2.setEmpId(616);
		emp2.setEmpSalary(40000);
		
		Employee emp3=new Employee();
		emp3.setEmpName("Prem");
		emp3.setEmpId(617);
		emp3.setEmpSalary(50000);
		
		
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sh = workbook.createSheet("EmployeeDetails");
		
			XSSFRow headerRow = sh.createRow(0);
			
				headerRow.createCell(0).setCellValue("EmpName");
				headerRow.createCell(1).setCellValue("EmpId");
				headerRow.createCell(2).setCellValue("EmpSalary");
				
				ArrayList<Employee> li=new ArrayList<Employee>();
				li.add(emp1);
				li.add(emp2);
				li.add(emp3);
				
				for(int i=0;i<li.size();i++) {
					Employee e= li.get(i);
					XSSFRow row=sh.createRow(i+1);
					row.createCell(0).setCellValue(e.getEmpName());
					row.createCell(1).setCellValue(e.getEmpId());
					row.createCell(2).setCellValue(e.getEmpSalary());
					
				}
				
				try {
					FileOutputStream  fileOut = new FileOutputStream("C:\\EmployeeTask\\Employee.xlsx");
					try {
						workbook.write(fileOut);
						workbook.close();
					} catch (IOException e) {
						
						e.printStackTrace();
						
					}
					System.out.println("Completed");
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				
			}

}
