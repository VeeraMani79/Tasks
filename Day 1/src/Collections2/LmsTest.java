package Collections2;

import java.util.HashMap;
import java.util.Iterator;

public class LmsTest {
 
	public static void main(String [] args) {
		HashMap<Integer,String>lm=new HashMap<> ();
		
		lm.put(401,"Arun");  // using put
		lm.put(402,"Jessema");
		lm.put(403, "Veera");
		lm.put(404," Priyanka");
		lm.put(405, "Manoj");
		lm.put(406, "abishek");
		
//		//lm.remove(401);        //using remove
//		
//		//System.out.println(lm);
//		
//		System.out.println(lm);    // using put
//		
//		
//		for(Integer x :lm.keySet()) {      // enhanced for loop get keys
//			System.out.println(x);
//		}
//		
//		for(String x :lm.values())
//			System.out.println(x);   // enhnaced for loop get values
//		
//		lm.forEach((x,y)->System.out.println(x+" "+y));   //lamda expression using get Kyes and values
//		
//		lm.keySet().forEach((x)->System.out.println(x));  //using lamda get keys
//		
//		lm.values().forEach((y)->System.out.println(y));   // using lamda get values
//		
//		
//		/*   Iterator<Integer>ans=lm.keySet().iterator();// using has next  Iterator get keys hash method
//		while(ans.hasNext()) {
//			System.out.println(ans.next());
//		}*/
//		
//     /*    Iterator<String>ans=lm.values().iterator();
//      while(ans.hasNext()) {
//    	  System.out.println(ans.next());   // using has and get values
//      }*/
		
	/*	Iterator<Integer>ans=lm.keySet().iterator();
		while(ans.hasNext()) {
			if(ans.next()>=402 && ans.next()<=405) {  // remove method get values
				ans.remove();
			}
		}
		
		System.out.println(lm);*/
		
	/*	Iterator<String>ans=lm.values().iterator(); // rem
		while(ans.hasNext()) {
			if(ans.next().equals("Veera")) {
				ans.remove();
				
			}
		}
	System.out.println(lm);	*/
}
}
