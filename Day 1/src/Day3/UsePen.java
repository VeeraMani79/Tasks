package Day3;

public class UsePen {
public static void main(String[]args) {
	
	Pen pen1= new Pen ();
	
	pen1.brand="reynolds";
	pen1.price= 5;
	pen1.color="blue";
	 String brand1="BLUE";
    String[] pen3=pen1.brand.split("n"); 
Pen pen2= new Pen ();

	pen2.brand="parker";
	pen2.price=25;
	pen2.color="balck";
	 String brand2="balck";
	 
	
	System.out.println(pen1.brand.toUpperCase()+pen2.brand.toUpperCase());
    System.out.println(pen1.brand.contains("r"));
    System.out.println(pen2.brand.contains("r"));
    System.out.println(pen1.color.equals("brand1"));
    System.out.println(pen2.color.equals("brand2"));
    System.out.println(pen2.color.charAt(4));
    System.out.println(pen1.color.charAt(2));
    System.out.println(pen3[0]+" "+pen3[1]);
    System.out.println(pen1.color.length());
    System.out.println(pen2.color.length());
    
    
	
	
}
}
