package Day3;

public class UseLaptop {
public static void main(String[]args) {
	
	Laptop l1= new Laptop ();
	
	l1.brand="dell";
	l1.price=450000;
	l1.color="BLACK";
	l1.isWarrenty=true;
	
	
	System.out.println(l1.brand.toUpperCase());
	System.out.println(l1.brand.length());
	System.out.println(l1.brand.indexOf("D"));
    System.out.println(3);
    System.out.println(l1.color.toLowerCase());
    
	
	
	
}
}
