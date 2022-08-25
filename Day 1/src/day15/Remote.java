package day15;

public class Remote {

	private String name1;
	private String color1;
	private int price1;
	public void setName1(String name1) {
		this.name1=name1;
	}
	public String getName1() {
		return this.name1;
	}
	public void setColor1(String color1) {
		this.color1=color1;
	}
	public String getColor1() {
		return this.color1;
	}
	public void setPrice1(int price1) {
		this.price1=price1;
	}
	public int getPrice1() {
		return this.price1;
	}
	public String toString() {
		 return "NAME="+name1+" "+"color="+color1+"price"+price1;
	}
}
