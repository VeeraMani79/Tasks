package veera;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;

public class Sorts {
	public static void main(String args[]){  
		  
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		  
		Collections.sort(al);  
//		Iterator itr=al.iterator();  
//    	while(itr.hasNext()){  
//		System.out.println(itr.next());  
//		} 
		System.out.println(al);
	}
}
