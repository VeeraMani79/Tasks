package oops1;

public class Mobile {

	private String brand;
	private int price;
	private Battery battery;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}
    public void setBattery(Battery battery) {
    	this.battery=battery;
    }
    public Battery getBattery() {
    	return this.battery;
    }
}
