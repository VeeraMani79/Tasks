package Collection3;

import java.util.ArrayList;

public class Employee {

	public static void main(String [] args) {
		
		ArrayList<String>empName=new ArrayList<> ();
		
		empName.add("sachin");
		empName.add("shewag");
		empName.add("Virat");
		
		
//		empName.stream().map(x->x.toUpperCase()).forEach(y->System.out.println(y));  //udsing map method
//		empName.stream().map(x->x.length()).forEach(y->System.out.println(y));// map
//		empName.stream().map(x->x.length()>5).forEach(y->System.out.println(y));// map stream 
		
		empName.stream().filter(x->x.contains("i")).forEach(y->System.out.println(y)); // using filter
		
	}
}
