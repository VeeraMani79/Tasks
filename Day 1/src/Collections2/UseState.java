package Collections2;

import java.util.HashMap;
import java.util.Iterator;

public class UseState {

	public static void main(String [] args ) {
		
		State s1=new State ("Tamilnadu","Stalin",38,"tamil","Chennai");
		State s2=new State("uttarapradesh","Adityanath",75, "urudu", "Lucknow");
		State s3=new State("Andrapradesh","Jeganmoha reddy",26, "telegu", "Amaravathi");
		State s4=new State("kerala","pinaroy vijayan",14,"malayalam","TRUVENDRAM");
		
		HashMap<Integer,State>hm=new HashMap<> ();
		
		hm.put(s1.getNoOfDistricts(),s1);
		hm.put(s2.getNoOfDistricts(),s2);
		hm.put(s3.getNoOfDistricts(),s3);
		hm.put(s4.getNoOfDistricts(),s4);
		
//		Iterator <Integer>ans=hm.keySet().iterator();
//		while(ans.hasNext()) {
//			System.out.println(ans.next());
//		}
//		
//		Iterator<State>ans=hm.values().iterator();
//		while(ans.hasNext()) {
//			System.out.println(ans.next().getName());
//			
//			
//			
//		}
		
		for(Integer x : hm.keySet()) {
			System.out.println(x);
		
		}
		
		
//		for(State x : hm.values()) {
//			System.out.println(x.getName());
//		}
////		
//		int max=0;
//		String a=" ";
//		for(State x: hm.values()) {
//			if(x.getNoOfDistricts()>max) {
//				max=x.getNoOfDistricts();
//				a=a+x.getCmName();
//			}
//		}
//		System.out.println(max+a);
	}
	
		
		
		
	}
	

