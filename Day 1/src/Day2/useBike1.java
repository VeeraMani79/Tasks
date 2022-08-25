package Day2;

public class useBike1 {
public static void main (String[]args) {
	Bike1 b1= new Bike1();
	b1.brand="honda";
	b1.price= 45000;
	b1.quality= true;
	b1.discount= 8;
	
	
	System.out.println(b1.price-(b1.price*8/100));
	
	
}
}
