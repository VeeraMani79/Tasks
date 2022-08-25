package Collections2;

import java.util.HashMap;

public class UseBike {

	public static void main(String [] args ) {
		
		Bike b1=new Bike("Honda","black",60000,300,true,4774426894278631l);
		Bike b2=new Bike("KTM","White",70000,200,false,47744264478631l);
		Bike b3=new Bike("Pulser","Red",90000,250,true,4774426892626631l);
		
		HashMap<Long,Bike>hm=new HashMap<> ();
		
		hm.put(b1.getChasisNumber(),b1);
		hm.put(b2.getChasisNumber(), b2);
		hm.put(b3.getChasisNumber(), b3);
//		
//		for(Long l:hm.keySet()) {
//				System.out.println(hm.get(l));  //Using key to values
//			}
//		for(Bike x: hm.values()) {
//			System.out.println(x.getColor());
//		}
	int max=0;
	//String a=" ";
		for(Bike x: hm.values()) {
			if(x.getPrice()%2==0) {
				max=x.getPrice();
				//a=a+x.getName();
			}
		}
		
		System.out.println(max);
	}
}
