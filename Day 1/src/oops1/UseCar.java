package oops1;

public class UseCar {

	public static void main(String[] args) {
		Engine engine=new Engine ();
		engine.brand="Ford";
		engine.price=12000;
		
		Car car=new Car ();
		car.brand="Hyndoi";
		car.color="blue";
		car.price=1000000;
		car.engine=engine;
		
		System.out.println("engine brand="+car.engine.brand);
		System.out.println("engine price="+car.engine.price); 
		System.out.println("car brand="+car.brand+" "+"car color="+car.color+" "+"car price="+car.price);
		System.out.println(car.carDetails());
		
		
	}
}
