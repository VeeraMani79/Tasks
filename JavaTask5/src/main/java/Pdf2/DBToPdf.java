package Pdf2;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class DBToPdf {
	public static void main(String [] args) {
		try {
		String fileName="C:\\GeneratedPdf\\veer2.pdf";
		
		Document document =new Document();
		
	PdfWriter.getInstance(document, new FileOutputStream(fileName));
	
	document.open();
	
	DataBaseConnection  obJDBConnection= new DataBaseConnection();
	
	Connection connection =obJDBConnection.getConnection();
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	String query ="select * from staff_info ";
	ps=connection.prepareStatement(query);
	rs=ps.executeQuery();
	
	while(rs.next()) {
		Paragraph para=new Paragraph(rs.getString("id")+"  "+rs.getString("name")+"  "+rs.getString("father_name")+"  "+rs.getString("salary")+"  "+rs.getString("posting"));
	
	    document.add(para);
	    document.add(new Paragraph(" "));
	}
	document.close();
	System.out.println("Finished");
	
	}catch(Exception e) {
		System.out.println(e);
	}

}
}