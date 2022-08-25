package Collections1;

import java.util.ArrayList;

public class UseWatch {

	public static void main(String [] args) {
		
		Watch w1=new Watch("Titan",1200,true);
		Watch w2=new Watch("Fastrack",1549,true);
		//Watch w3=new Watch("Sonata",1955,false);
		
		ArrayList<Watch>watchDetails=new ArrayList<>();
		
		watchDetails.add(w1);
		watchDetails.add(w2);
	//	watchDetails.add(w3);
		
	//	for(int i=0;i<watchDetails.size();i++) {
			//System.out.println(watchDetails.get(i));
		//}
		
	//	for(Watch s :watchDetails) {
		//	System.out.println(s);
		//}
		//watchDetails.forEach(x->System.out.println(x));
		
//		for(int i=0;i<watchDetails.size();i++) {
//			System.out.println(watchDetails.get(i).getBrand()+","+watchDetails.get(i).getPrice()+","+watchDetails.get(i).getWarranty());
//		}
//		for(Watch s: watchDetails) {
//			System.out.println(s.getBrand()+","+s.getPrice()+","+s.getWarranty());
//		}
//		watchDetails.forEach(x->System.out.println(x.getBrand()+","+x.getPrice()+","+x.getWarranty()));
//	}
	    
//		String a=" ";
//	    for(int i=0;i<watchDetails.size();i++) {
//	    	if(watchDetails.get(i).getPrice()%2==0) {
//	    		a=a+watchDetails.get(i).getBrand();
//	    	}
//	    }
//		System.out.println(a);
//		
		
		
		
	}
}
