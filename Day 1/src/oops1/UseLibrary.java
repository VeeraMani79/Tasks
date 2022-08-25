package oops1;

public class UseLibrary {

	public static void main(String[] args) {
		
		Book book=new Book ();
		
		book.author="Indian author";
		book.noOfDepartments=50;
		book.price=500;
		
		Library library=new Library ();
		library.name="DUGAN";
		library.area="channai";
		library.noOfFloors=6;
		library.book=book;
		
		System.out.println("AUTHOR="+library.book.author+"\n"+"DEPARTSMENTS="+library.book.noOfDepartments+"\n"+"PRICE="+library.book.price);
		System.out.println("NAME="+library.name+"\n"+"LOCATION="+library.area+"\n"+"FLOORS="+library.noOfFloors);
		System.out.println(library.libraryDetails());
		
		
		
	}
	
}
