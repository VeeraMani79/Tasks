package Examples;

public class Car {

	private String brand;
	private String color;
	private boolean isElectric;
	private int price;
	private int enginecc;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getIsElectric() {
		return isElectric;
	}
	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEnginecc() {
		return enginecc;
	}
	public void setEnginecc(int enginecc) {
		this.enginecc = enginecc;
	}
	
	public Car(String brand, String color, boolean isElectric, int price, int enginecc) {
		super();
		this.brand = brand;
		this.color = color;
		this.isElectric = isElectric;
		this.price = price;
		this.enginecc = enginecc;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", isElectric=" + isElectric + ", price=" + price
				+ ", enginecc=" + enginecc + "]";
	}

}
