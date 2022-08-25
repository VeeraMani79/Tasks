package Examples;

public class Fan {

	private int price;
	private int noOfWings;
	private String brand;
	private String color;
	private boolean isTableFan;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoOfWings() {
		return noOfWings;
	}

	public void setNoOfWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}

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

	public boolean getIsTableFan() {
		return isTableFan;
	}

	public void setTableFan(boolean isTableFan) {
		this.isTableFan = isTableFan;
	}

	public Fan(int price, int noOfWings, String brand, String color, boolean isTableFan) {
		super();
		this.price = price;
		this.noOfWings = noOfWings;
		this.brand = brand;
		this.color = color;
		this.isTableFan = isTableFan;
	}

	public String toString() {
		return "Fan [price=" + price + ", noOfWings=" + noOfWings + ", brand=" + brand + ", color=" + color
				+ ", isTableFan=" + isTableFan + "]";
	}

}
