package Day2;

public class useBike {
public static void main(String[]args) {

	Bike b1=new Bike();
	b1.price=75000;
	b1.brand="HONDA";
	b1.quality=true;
	b1.serialNo=12345678971l;
	b1.weight=150.5f;
	
	Bike b2=new Bike();
	b2.price=75000;
	b2.brand="HONDA";
	b2.quality=true;
	b2.serialNo=12345678971l;
	b2.weight=150.5f;
	
	Bike b3=new Bike();
	b3.price=75000;
	b3.brand="HONDA";
	b3.quality=true;
	b3.serialNo=12345678971l;
	b3.weight=150.5f;
	
	
	System.out.println(b3.price+b3.brand+b3.quality+b3.serialNo+b3.weight);
	
	System.out.println("price="+b2.price+","+"brand="+b2.brand+","+"quality="+b2.quality+","+"serialNo="+b2.serialNo+","+"weight="+b2.weight);
	
	System.out.println("The price of the bike is " +b1.price+"and brand is" +b1.brand+","+"is it quality" +b1.quality+","+"And the bike number is " +b1.serialNo+","+"weight of my bike" +b1.weight+","+"Honda is my bike which i like more than mine");
	
	
	
	
	
	
	
	
	
	
	
}
}