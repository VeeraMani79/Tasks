package OOps2;

public class UseSportsCar {

	public static void main(String[] args)   {
		SportsCar sc=new SportsCar();	
		System.out.println(sc.ShowSpeed(400));
		
		Car c=new Car();
		System.out.println(c.ShowSpeed(300));
	
		Car c1=new SportsCar();
		System.out.println(c1.ShowSpeed(300));
	}
}
