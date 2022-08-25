package Collections1;

public class Watch {

	private String brand;
	private int price;
	private boolean isWarrentyAvailable;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand( ) {
		return this.brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice( ) {
		return this.price;
	}
	public void setWarranty(boolean  isWarrentyAvilable) {
		this.isWarrentyAvailable=isWarrentyAvilable;
	}
	public boolean getWarranty() {
		return this.isWarrentyAvailable;
	}
	
	public Watch(String brand,int price,boolean isWarrentyAvailable) {
		this.brand=brand;
		this.price=price;
		this.isWarrentyAvailable=isWarrentyAvailable;
	}
	//public String toString() {
		//return "BRAND="+brand+","+"PRICE="+price+","+"Warrenty="+isWarrentyAvailable;
	//}
}
