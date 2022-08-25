package oops1;

public class Car {
  
	String brand;
	String color;
	int price;
	Engine engine;
	
	public String carDetails () {
		return brand+"\n"+color+"\n"+price+"\n"+engine.engineDetails();
		
	}
	
}
