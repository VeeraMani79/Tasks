package Pdf.JavaTasks5;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Generated_Pdf {

	public static void main(String [] args) {
		try {                                                         
			
		
		String file_Name="C:\\GeneratedPdf\\veer1.pdf";
		
		Document document =new Document ();
		//create simple paragraph 
		PdfWriter.getInstance(document, new FileOutputStream(file_Name));
		document.open();
   	    Paragraph para=new Paragraph ("Veera is the best kabbadi palyer.he is gentle man.He very innocent");
	    document.add(para);
	   //add image 
	    document.add (new Paragraph(" "));
	    document.add (new Paragraph(" "));
	    document.add (new Paragraph(" "));
	    document.add (new Paragraph(" "));
	    document.add (new Paragraph(" "));
	    document.add (new Paragraph(" "));
	    
	    
	    
	    
	    //add table
	    PdfPTable table=new PdfPTable(3);
	    PdfPCell c1=new PdfPCell(new Phrase("Name"));
	    table.addCell(c1);
	    
	    c1=new PdfPCell(new Phrase("Age"));
	    table.addCell(c1);
	    
	    c1=new PdfPCell(new Phrase("Gender"));
	    table.addCell(c1);
	    table.setHeaderRows(1);
	    
	    table.addCell("Veera");
	    table.addCell("10");
	    table.addCell("Male");
	    table.addCell("Mani");
	    table.addCell("11");
	    table.addCell("Female");
	    
	    
	    document.add(table);
	    
	    // add image
	    
	    document.add(Image.getInstance("C:\\GeneratedPdf\\javafeature.png"));
	
		document.close();
		System.out.println("Successfully Created");
		
		}catch(Exception e) {
			System.err.println(e);
		}
		
	}
		



}
