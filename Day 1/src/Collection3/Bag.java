package Collection3;

public class Bag {

	private String brand;
	private String color;
	private boolean isWaterProof;
	private int price;
	private int noOfZip;
	
	public void setBrand(String brand) {
		this.brand=brand;	
	}
	public String getBrand() {
		return this.brand;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public void setWaterProof(boolean isWaterProof) {
		this.isWaterProof=isWaterProof;
	}
	public boolean getWaterProof() {
		return this.isWaterProof;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setZips(int noOfZip) {
		this.noOfZip=noOfZip;
	}
	public int getZips() {
		return this.noOfZip;
	}
	public Bag (String brand,String color,boolean isWaterProof,int price,int noOfZip) {
		this.brand=brand;
		this.color=color;
		this.isWaterProof=isWaterProof;
		this.price=price;
		this.noOfZip=noOfZip;
	
	}
	@Override
	public String toString() {
		return "Bag [brand=" + brand + ", color=" + color + ", isWaterProof=" + isWaterProof + ", price=" + price
				+ ", noOfZip=" + noOfZip + "]";
	}	
}
