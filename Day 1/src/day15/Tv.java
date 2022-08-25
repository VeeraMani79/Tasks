package day15;

public class Tv {
 
	private String name;
	private String color;
	private int price;
	private Remote remote;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return this.price;
	}
	public void setRemote(Remote remote) {
		this.remote=remote;
	}
	public Remote getRemote() {
		return this.remote;
	}
	
	public String toString() { 
		 return "NAME="+name+" "+"color="+color+" "+"price="+price+" "+remote;
	}
	
}
