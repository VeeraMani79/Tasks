package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCricketMatch {
 
	public static void main(String [] args) {
		
		CricketMatch cm1=new CricketMatch("T20","India",true,200000,"Virai");
		CricketMatch cm2=new CricketMatch("Test","Austrila",true,100000,"Smiti");
		CricketMatch cm3=new CricketMatch("IPL","CSK",false,1500000,"Dhon");
		
		ArrayList<CricketMatch>cm=new ArrayList<>();
		
		cm.add(cm1);
		cm.add(cm2);
		cm.add(cm3);
		List<CricketMatch>icc=cm.stream().filter(x->x.getIccMatch()==false).collect(Collectors.toList());
		
		//icc.forEach(y->System.out.println(y.getTeamName()+(y.getWinningPrice()-1000)+y.getManOfTheSeries()));
	
		icc.forEach(y->System.out.println(y));
		
	//	List<CricketMatch>icc=cm.stream().filter(x->!x.getIccMatch()).collect(Collectors.toList());
		
		
//		long a=cm.stream().count();
//		System.out.println(a);
//		long b=cm.stream().filter(x->x.getWinningPrice()<300000).count();
//		System.out.println(b);
				
//		cm.stream().map(x->x.getIccMatch()==true).forEach(y->System.out.println(y));    //using map and stream
//		cm.stream().map(x->x.getWinningPrice()-((x.getWinningPrice()*50)/100)).forEach(y->System.out.println(y));// same as above
//		cm.stream().map(x->x.getTeamName().charAt(x.getTeamName().length()-1)).forEach(y->System.out.println(y));
//		
		
//		List<Boolean>icc=cm.stream().map(x->x.getIccMatch()==true).collect(Collectors.toList());//using for eachLoop
//		icc.forEach(y->System.out.println(y));
//		for(Boolean x: icc) {
//			System.out.println(icc);  //  using enhanced loop 
//		}
//		
//		List<Integer>icc=cm.stream().map(x->x.getWinningPrice()-((x.getWinningPrice()*50)/100)).collect(Collectors.toList());
//		icc.forEach(y->System.out.println(y));  // using foe each loop to list
//		for(Integer x : icc) {
//			System.out.println(icc); // using enhancaed loop
//		}
//		
		
//		List<Character>icc=cm.stream().map(x->x.getTeamName().charAt(x.getTeamName().length()-1)).collect(Collectors.toList());
//		icc.forEach(y->System.out.println(y));   // using enhance for loop and toList
		
		
		//cm.stream().filter(y->y.getWinningPrice()<800000).forEach(x->System.out.println(x.getMatchType()));// using filter
		
		
//		List<CricketMatch>icc=cm.stream().filter(y->y.getWinningPrice()<1000000&&y.getIccMatch()==true).collect(Collectors.toList());
//		
//	icc.forEach(x->System.out.println(x.getMatchType()));//to List
//	for(CricketMatch y : icc) {
//		System.out.println(y.getMatchType());   //using filter
		
		
		//cm.stream().filter(o->o.getTeamName().contains("a")).map(x->x.getTeamName().toUpperCase()).forEach(z->System.out.println(z));
		// using filter and map;
		
		
//		List<Integer>icc=cm.stream().filter(o->o.getTeamName().contains("s")).map(s->s.getWinningPrice()+((s.getWinningPrice()*5)/100)).collect(Collectors.toList());
//	 
//		icc.forEach(m->System.out.println(m));  //using to list filter and map;
		
	}
	
}
