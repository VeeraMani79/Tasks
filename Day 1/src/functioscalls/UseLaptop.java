package functioscalls;

public class UseLaptop {
 
	public static void main(String [] args) {
		Laptop l1=new Laptop();
		l1.brand="lenova";
		l1.color="black";
		l1.price=50000;
		l1.isTouchScreen=true;
		
		Laptop l2=new Laptop();
		l2.brand="Acer";
		l2.color="white";
		l2.price=40000;
		l2.isTouchScreen=true;
		
		Laptop l3=new Laptop();
		l3.brand="dell";
		l3.color="red";
		l3.price=30000;
		l3.isTouchScreen=false;
		
		Laptop [] laps= {l1,l2,l3};
		
		int a=l1.findMaxPrice(laps);
		System.out.println("the high end lap price is: "+a);
		int b=l1.findMinPrice(laps);
		System.out.println("the low end lap price is: "+b);
		
		
				
	}
}
