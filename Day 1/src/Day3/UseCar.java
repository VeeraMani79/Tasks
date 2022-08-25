package Day3;

public class UseCar {
public static void main(String[]args) {

	Car c1=new Car();
	c1.brand="BMW";
	c1.model="XVI";
	c1.price=400000;
	c1.isPetrol=false;
	
	Car c2=new Car();
	c2.brand="TATA";
	c2.model="XI";
	c2.price=300000;
	c2.isPetrol=true;
	
	Car c3=new Car();
	c3.brand="SWIFT";
	c3.model="X2V";
	c3.price=200000;
	c3.isPetrol=true;
	int totalPrice=c1.price+c2.price+c3.price;
	
	System.out.println(c1.brand.length());
	System.out.println(c2.brand.length());
	System.out.println(c3.brand.length());
	System.out.println("totalprice of three cars = "+ totalPrice);
	System .out.println(c1.brand.toUpperCase()+c2.brand.toUpperCase()+c3.brand.toUpperCase());
	System.out.println(c1.brand+" "+c1.model+" "+c1.price+" "+c1.isPetrol);
	System.out.println(c2.brand+" "+c2.model+" "+c2.price+" "+c2.isPetrol);
	System.out.println(c3.brand+" "+c3.model+" "+c3.price+" "+c3.isPetrol);
	
	
	
	
	
	
	
	
	
	
}
}
