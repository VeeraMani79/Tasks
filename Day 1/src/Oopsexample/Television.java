package Oopsexample;

public class Television extends SmartTelevision {

	String brand;
	int price;
	
	public String  getNetPrice(int price,int deliveyCharge) {
		if(price>50000) {
			return "heavy";
		}
		else {
			return "bleow 50000";
		}
	}
	public String wifiAccess(String access) {
		return access;
	}
}
