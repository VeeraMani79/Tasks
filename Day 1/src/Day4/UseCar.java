package Day4;

public class UseCar{
public static void main(String[]args) {	
	
	Car c1= new Car();
	c1.brand=args[0];
	
	int b=Integer.parseInt(args[1]);
	
	c1.price= b;
	
	System.out.println(c1.brand);
	System.out.println(c1.price);
}
}