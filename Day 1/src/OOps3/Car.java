package OOps3;

public class Car implements Transport,Vehicle {
	String name;
	int price;
	String color;
	
	public int findRoadTax(int amount,int taxPer) {
		return amount*taxPer/100;
	}
	
	public int findGstAmount(int amount,int taxPer) {
		return amount*taxPer/100;
	

}
}