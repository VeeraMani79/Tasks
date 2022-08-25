package functioscalls;

public class Bike {

	String brand;
	int price;
	int taxPercentage;
	String model;

	public void netPrice() {

		int taxAmount = price * taxPercentage / 100;
		System.out.println("netPrice="+( price + taxAmount));
	}

	public void display () {
		 System.out.println("BRAND="+brand+","+"PRICE="+price+","+"MODEL="+model);
	}
	
}
