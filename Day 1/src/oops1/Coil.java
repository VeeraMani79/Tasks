package oops1;

public class Coil {
	private String brand;
	private String material;

	public void setBrand(String brand) {
		this.brand = brand;

	}

	public String getBrand() {
		return this.brand;
	}

	public void setMaterial(String material) {
		this.material = material;

	}

	public String getMaterial() {
		return this.material;
	}
	public Coil (String brand,String material) {
    	this.brand=brand;
    	this.material=material;
	}
   public String toString() {
	   return "BRAND="+brand+", "+"MATERIAL="+material;
   }


}

