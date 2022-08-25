package Examples;

public class Chair {

	private int price;
	private String color;
	private String material;
	private float weight;
	private boolean isGood;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public boolean isGood() {
		return isGood;
	}
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
	public Chair(int price, String color, String material, float weight, boolean isGood) {
		super();
		this.price = price;
		this.color = color;
		this.material = material;
		this.weight = weight;
		this.isGood = isGood;
	}
	public String toString() {
		return "Chair [price=" + price + ", color=" + color + ", material=" + material + ", weight=" + weight
				+ ", isGood=" + isGood + "]";
	}
	
}