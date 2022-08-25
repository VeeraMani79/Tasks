package Collections1;

import java.util.ArrayList;

public class Employee {

	public static void main(String[] args) {
		
		ArrayList<String>empName=new ArrayList <> ();
		
		empName.add("Veera");
		empName.add("subha");
		empName.add("praksh");
		empName.add("ragav");
		
		//System.out.println(empName);        // add() method
		//System.out.println(empName.get(0));   // get () method
		//System.out.println(empName.size());  // size () method
	//	empName.set(3,"vijay");
		//System.out.println(empName);         //set () method
		 
	//	empName.remove(2);     // remove () 
		//System.out.println(empName); 
		
		//empName.add(2,"sooriya");   // value insert method
		//System.out.println(empName);
		
		//for(int i=0;i<empName.size();i++) {        //using normal loop
		//	System.out.println(empName.get(i));
		//}
		
		//for(int i=0;i<empName.size();i++) {
	//		System.out.println(empName.get(i).charAt(empName.get(i).length()-1));   //last letter find fo loop
		//}
		 
		//for (String s : empName) {
			//System.out.println(s);   // enhanced for loop using
	//	}
		//
	//	for(String s: empName) {
			//System.out.println(s.substring(1,s.length()-1));   //find leter letters
	//	}
		
		empName.forEach(x->System.out.println(x));         //forEach () method using
		
	}
	
}
