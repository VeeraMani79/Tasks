package oops1;

public class Library {

	String name;
	String area;
	int noOfFloors;
	Book book;
	
	public String libraryDetails() {
		return "NAME="+name+"\n"+"AREA="+area+"\n"+"FLOORS="+noOfFloors+"\n"+book.bookDetails();
	}
	
	
}
