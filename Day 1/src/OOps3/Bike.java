package OOps3;

public class Bike implements Transport,Vehicle {
	
	String name;
	int price;
	
	public int findRoadTax(int amount,int taxPer) {
		return amount*taxPer/100;
	}
	
	public int findGstAmount(int amount,int taxPer) {
		return amount*taxPer/100;
	}
}
