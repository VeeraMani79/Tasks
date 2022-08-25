package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseFan {

	public static void main(String[] args) {
		
	Fan f1=new Fan(2000,2,"Usha","Black",true);
	Fan f2=new Fan(2500,3,"Crompton Greaves","Brown",false);
	Fan f3=new Fan(3000,4,"Superfan","White",false);
	
	ArrayList<Fan>fans=new ArrayList <> ();
	
	fans.add(f1);
	fans.add(f2);
	fans.add(f3);
	
	
//	List<Fan>ic=fans.stream().filter(x->x.isTableFan()==false).collect(Collectors.toList());
//    ic.forEach(y->System.out.println(y));
//
//	long a=fans.stream().filter(x->x.getPrice()<=2000).count();
//	System.out.println(a);
//	
//	List<Integer>icc=fans.stream().map(x->x.getPrice()+((x.getPrice()*50)/100)).collect(Collectors.toList());
//	icc.forEach(y->System.out.println(y));  // using foe each loop to list
////	for(Integer x : icc) {
////		System.out.println(icc);      // using enhancaed loop	
			
//	List<Fan>ic=fans.stream().filter(x->x.getColor().startsWith("B")).collect(Collectors.toList());
//	ic.forEach(y->System.out.println("PRICE="+y.getPrice()+","+"COLOR="+y.getColor()+","+"BRAND="+y.getBrand()));
//	
	
	fans.stream().map(x->x.getColor());
	for(Fan x : fans) {
		System.out.println(x.getColor().charAt(x.getColor().length()-4));
	}
	
	
	}
}

	
