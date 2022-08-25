package Exception_examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingTheFile {

	public static void main(String [] args) throws IOException {   //FileNotFound key
		File a=new File("C:\\Users\\acer\\Videos\\New folder/eera.txt");
		FileInputStream b=null;
		try {
			b=new FileInputStream (a);
			int c=0;
			while ((c=b.read())!=-1) {
				System.out.println((char)c);
		}
	}catch(FileNotFoundException c){
		System.out.println("Not Found");
	}finally {
		b.close();
	}
}

}