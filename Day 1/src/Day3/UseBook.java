package Day3;

public class UseBook {
public static void main(String[]args) {
	Book b1=new Book();
	Book b2=new Book();
	
	b1.name= "harryPotter";
	b1.price=1000;
	b2.name="hero";
	b2.price=800;
	
	System.out.println(b1.name.toUpperCase()+b1.price);
	System.out.println(b2.name.toUpperCase()+b2.price);
	
	
	
	
	
}
}
