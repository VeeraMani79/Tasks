package Collections1;

import java.util.ArrayList;

public class UseMarker {

	public static void main(String [] args) {
		
		Marker m1=new Marker("cello",30,true);
		Marker m2=new Marker("Reynolds",28,false);
		Marker m3=new Marker("flair",25,false);
		Marker m4=new Marker("camlin",40,true);
		Marker m5=new Marker("faberCastle",45,true);
		
		ArrayList<Marker>markerDetails=new ArrayList<>();
		
		markerDetails.add(m1);
		markerDetails.add(m2);
		markerDetails.add(m3);
		markerDetails.add(m4);
		markerDetails.add(m5);
		//int total=0; using enhanced for loop
		//for(Marker s : markerDetails) {
			//total=total+s.getPrice();
					
	//	}
		//System.out.println(total);
		
		//String b=" ";
	//	for(Marker s: markerDetails) {
			//b=b+s.getBrand();
		//}
		//System.out.println(b);
	//}
	
	//	int a=0;
		//for(Marker s :markerDetails ) {
		//	if(s.getPrice()>=30) {
			//	a=a+s.getPrice();
			//}
			
	//	}
		
		//System.out.println(a);
//	}

	//	String b=" ";
		//for(Marker s :markerDetails) {
			//if(s.getFilable()==true) {
		
	//			b=b+s.getBrand();
		//	}
		//}
		//System.out.println(b);
		int max=0;
		for(int i=0;i<markerDetails.size();i++) {
			if(markerDetails.get(i).getFilable()==false) {
				if(markerDetails.get(i).getPrice()>max) {
					max=markerDetails.get(i).getPrice();
				}
			}
			
		}
	System.out.println(max);	  
}
}