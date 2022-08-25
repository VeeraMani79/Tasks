package OOps3;

public class UseCar {
  
	public static void main(String [] args) {
		Car c1=new Car ();
		String name1="Audi";
		int price1=5000000;
		String color1="Black";
	
	
		System.out.println("Roadtax="+c1.findRoadTax(price1, 15) + ", GStAmount=" + c1.findGstAmount(price1, 22)+"," + "Name=" + name1 + ","
				+ "Price=" + price1+"Color="+color1);

		
		Car c2=new Car ();
		String name2="Nisson";
		int price2=6000000;
		String color2="White";
	
	
		System.out.println("Roadtax="+c2.findRoadTax(price2, 15) + ", GStAmount=" + c2.findGstAmount(price2, 22)+"," + "Name=" + name2 + ","
				+ "Price=" + price2+" ,Color="+color2);

		Car c3=new Car ();
		String name3="Audi";
		int price3=7000000;
		String color3="Red";
	
	
		System.out.println("Roadtax="+c3.findRoadTax(price3, 15) + ", GStAmount=" + c3.findGstAmount(price3, 22)+"," + "Name=" + name1 + ","
				+ "Price=" + price3+" ,Color="+color3);

		
	}
}
