package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCar {

	public static void main(String [] args) {
		
		Car car1=new Car("Nissan","Black",true,70000000,1500);
		Car car2=new Car("Hyndai","Blue",false,80000000,2000);
		Car car3=new Car("Tata","pink",true,75000000,1300);
		Car car4=new Car("KIA","Sandle",true,80000000,1700);
		Car car5=new Car("Omini","SkyBlue",false,90000000,1200);
		Car car6=new Car("Swift","Red",true,50000000,1800);
		
		ArrayList<Car> cars=new ArrayList <> ();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		
//		
//	List<Car>ic=cars.stream().filter(x->x.getIsElectric()==false).collect(Collectors.toList());
//	//ic.forEach(y->System.out.println(y+"\n")); //using forEach loop
//	for(Car x: ic) {  // enhanced for loop	
//	}	
//	System.out.println(ic+"\n");	
//	}
//		List<Character>icc=cars.stream().map(x->x.getBrand().charAt(x.getBrand().length()-1)).collect(Collectors.toList());
//		icc.forEach(y->System.out.println(y));
//		
//	List<Car>icc=cars.stream().filter(x->x.getColor().startsWith("B")).collect(Collectors.toList());
//		
//		icc.forEach(y->System.out.println(y.getBrand()+" ,"+(y.getPrice()+1000)+" ,"+y.getEnginecc()));
//	 
		long a=cars.stream().count();
		System.out.println(a);
		long b=cars.stream().filter(x->x.getEnginecc()>=1500).count();
		System.out.println(b);
		
	}
}
