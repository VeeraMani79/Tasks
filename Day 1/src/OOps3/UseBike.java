package OOps3;

public class UseBike {

	public static void main(String[] args) {

		Bike bike1 = new Bike();

		String name = "pulser";
		int price = 80000;

		System.out.println("Roadtax="+bike1.findRoadTax(price, 10) + ", GStAmount=" + bike1.findGstAmount(price, 18)+"," + "Name=" + name + ","
				+ "Price=" + price);

		Bike bike2 = new Bike();

		String name1 = "KTM";
		int price1 = 90000;

		System.out.println("Roadtax="+bike1.findRoadTax(price1, 10) + ", GSTAmount" + bike1.findGstAmount(price1, 18)+"," + "Name=" + name1 + ","
				+ "Price=" + price1);

	}
}
