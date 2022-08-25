package Collections1;

public class Marker {

	private String brand;
	private int price;
	private boolean isRefilable;
	
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
	public void setFilable(boolean  isRefilable) {
		this.isRefilable=isRefilable;
	}
	public boolean getFilable() {
		return this.isRefilable;
	}
	
	public Marker(String brand,int price,boolean isRefilable) {
		this.brand=brand;
		this.price=price;
		this.isRefilable=isRefilable;
	}
}
