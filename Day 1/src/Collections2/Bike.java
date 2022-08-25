package Collections2;

public class Bike {
 private String name;
 private String color;
 private int price;
 private int enginecc;
 private boolean isSpotrsBike;
 private long chasisNumber;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
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
public boolean isSpotrsBike() {
	return isSpotrsBike;
}
public void setSpotrsBike(boolean isSpotrsBike) {
	this.isSpotrsBike = isSpotrsBike;
}
public long getChasisNumber() {
	return chasisNumber;
}
public void setChasisNumber(long chasisNumber) {
	this.chasisNumber = chasisNumber;
}
public Bike(String name, String color, int price, int enginecc, boolean isSpotrsBike, long chasisNumber) {
	super();
	this.name = name;
	this.color = color;
	this.price = price;
	this.enginecc = enginecc;
	this.isSpotrsBike = isSpotrsBike;
	this.chasisNumber = chasisNumber;
}

public String toString() {
	return "Bike [name=" + name + ", color=" + color + ", price=" + price + ", enginecc=" + enginecc + ", isSpotrsBike="
			+ isSpotrsBike + ", chasisNumber=" + chasisNumber + "]";
}
 
 
 
 
}
