package GeneratedDocs.JavaTask8;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class GeneratedDocc_To_DB {
	public static void main(String[] args) {

		try {

			XWPFDocument document = new XWPFDocument();
			FileOutputStream out = new FileOutputStream(new File("C:\\GenerateDocs\\sampledocs.docx"));

			XWPFParagraph paragraph = document.createParagraph();
			XWPFRun run = paragraph.createRun();
            
			
			
			
			
			DataBaseConnection dbcon = new DataBaseConnection();
			Connection connection = dbcon.getConnection();
			String query = "select * from city";
			Statement stmt = null;
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
			
				run.setText(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5));
				run.setText(rs.getString(2));
				run.setText(rs.getString (3));
				
			}

			document.write(out);
			out.close();
			System.out.println("Created Successfully");

		} catch (Exception e) {
			System.out.println(e);

		}
	}
}