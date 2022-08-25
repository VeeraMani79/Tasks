package GeneratedDocs.JavaTask8;

import java.io.File;

import java.io.FileOutputStream;


import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class GeneratedDocument {

	public static void main(String [] args) {
		try {	
		XWPFDocument document=new  XWPFDocument();
		 
	
		FileOutputStream	file = new FileOutputStream(new File("C:\\GenerateDocs\\sampledocs.docx"));
		 
		
		XWPFParagraph paragraph=document.createParagraph();
		XWPFRun run=paragraph.createRun();
		run.setText("Its me veeramani very ");
		
		//create table
		
		XWPFTable  table=document.createTable();
		
		//create first row
		
		XWPFTableRow row1=table.getRow(0);
		row1.getCell(0).setText("Veera,Male");;
		row1.addNewTableCell().setText("Mani,Male");
		row1.addNewTableCell().setText("Mano,male");
		
		//second row created
		XWPFTableRow row2=table.createRow();
		row2.getCell(0).setText("Veera,Male");;
		row2.getCell(1).setText("Mani,Male");
		row2.getCell(2).setText("Mano,male");
		
		//third row created
		XWPFTableRow row3=table.createRow();
		row3.getCell(0).setText("Veera,Male");;
		row3.getCell(1).setText("Mani,Male");
		row3.getCell(2).setText("Mano,male");
		
					document.write(file);
		
	document.close();
		System.out.println("Successfully created");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
