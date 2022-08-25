package Collections2;

import java.util.*;

public class UseDetailsCustomer {
	public static void main(String [] args) {
		
	CustomerDetails c1=new CustomerDetails("Veera",23,"verra@a",245213412245l,"BUCPV047");
	CustomerDetails c2=new CustomerDetails("Priya",22,"priya@a",2454748412245l,"BHHPV048");
	CustomerDetails c3=new CustomerDetails("Arun",24,"arun@a",248743412245l,"BUCV043");
	CustomerDetails c4=new CustomerDetails("Manoj",21,"mano@a",2452137632245l,"BUCPV042");
	CustomerDetails c5=new CustomerDetails("Abishek",25,"abi@a",245213433245l,"BUCPV046");
	
	HashMap<Long,CustomerDetails> hm=new HashMap<> ();
	
	hm.put(c1.getNo(),c1);
	hm.put(c2.getNo(),c2);
	hm.put(c3.getNo(),c3);
	hm.put(c4.getNo(),c4);
	hm.put(c5.getNo(),c5);
	
//	for(Long l:hm.keySet()) {
	//	System.out.println(hm.get(l));  //Using key to values
//	}

	//for( CustomerDetails x: hm.values()) { //using values to values
			//System.out.println(x);
		//}
	//}
	
  //for (Long x: hm.keySet() ) {    //Using key to key 
	 // System.out.println(x);
  //}
	
	//hm.forEach((x,y)->System.out.println(x+" "+y)); //lamda using get keys and values
	
//	Iterator<Long>ans=hm.keySet().iterator();    // using has next  Iterator get keys hash method
 //  while(ans.hasNext()) {
  //	System.out.println(ans.next());
//}
	
//	 Iterator<CustomerDetails>ans=hm.values().iterator();
 //  while(ans.hasNext()) {
 //	  System.out.println(ans.next());   // using  Iterator has and get values
//}
	
	
//	Iterator<CustomerDetails>ans=hm.values().iterator(); 
//	whiloe(ans.hasNext()) {
//		if(ans.next().getName().startsWith("M")) {   
//			ans.remove();
//		}
//		}
//	System.out.println(hm);
//	
	int max=0;
	String a=" ";
	for(CustomerDetails x:hm.values()) {
		if(x.getAge()>max) {   // highest age find
			max=x.getAge();
			a=a+x.getName();
		}
		
	}
	System.out.println(max+a);
	
//	for(CustomerDetails s: hm.values()) {
//	System.out.println(s.getName()+","+s.getAge()+","+s.getEmail()+","+s.getNo()+","+s.getPan());
//	
//	}
}
}
