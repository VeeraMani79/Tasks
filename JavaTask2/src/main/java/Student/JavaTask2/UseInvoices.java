package Student.JavaTask2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UseInvoices {
	public static void main(String[] args)  {
		Invoices invoice1 =new Invoices(1,"Books",2,150.0f,"10-01-2022");
		Invoices invoice2 =new Invoices(2,"Notes",3,140.0f,"13-01-2022");
		Invoices invoice3 =new Invoices(3,"Pens",5,130.0f,"16-01-2022");
		Invoices invoice4 =new Invoices(4,"Boxes",7,120.0f,"23-01-2022");
		Invoices invoice5 =new Invoices(5,"Pepers",1,110.0f,"30-01-2022");
		
		XSSFWorkbook workbook =new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("InvoiceDetails");
        XSSFRow headerRow=sheet.createRow(0);
        
        headerRow.createCell(0).setCellValue("ProductId");
        headerRow.createCell(1).setCellValue("ProductName");
        headerRow.createCell(2).setCellValue("ProductQuantity");
        headerRow.createCell(3).setCellValue("ProductTotalPrice");
        headerRow.createCell(4).setCellValue("ProductSaleDate");
        
		
		Invoices [] invoices= {invoice1,invoice2,invoice3,invoice4,invoice5};
		
		for(int i=0;i<invoices.length;i++) {
			Invoices inv=invoices[i];            
			XSSFRow row=sheet.createRow(i+1);
			row.createCell(0).setCellValue(inv.getItemId());
			row.createCell(1).setCellValue(inv.getItemName());
			row.createCell(2).setCellValue(inv.getItemQty());
			row.createCell(3).setCellValue(inv.getTotalPrice());
			row.createCell(4).setCellValue(inv.getItemSoldDete());
		}
			try {
			
          FileOutputStream fileout=new FileOutputStream("C:\\InvoiceTask\\Invoice.xlsx");
          try {
        	  workbook.write(fileout);
        	  workbook.close();
	}catch(IOException var) {
			var.printStackTrace();
	}
          System.out.println("Saved");
			
			
		}catch (FileNotFoundException var) {
			var.printStackTrace();
		}
		
	}
}
