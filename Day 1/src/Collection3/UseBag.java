package Collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseBag {

	public static void main(String [] args) {
		Bag bag1=new Bag("AmericanTourister","Blue",true,2000,4);
		Bag bag2=new Bag("WildCraft","yellow",false,1800,3);
		Bag bag3=new Bag("SkyBag","Black",true,3000,5);
		Bag bag4=new Bag("LenovoBag","Black",false,500,2);
		
		ArrayList<Bag>bags=new ArrayList<> ();
		 bags.add(bag1);
		 bags.add(bag2);
		 bags.add(bag3);
		 bags.add(bag4);
		
		// bags.stream().map(x->x.getColor().substring(1,(x.getColor().length()-1))).forEach(y->System.out.println(y.length()));
		
//		 List<String>icc=bags.stream().map(x->x.getColor().substring(1,(x.getColor().length()-1))).collect(Collectors.toList());
//		 for(String x :icc) {
//			 System.out.println(x.length());
//		 }
		
	//	 bags.stream().map(x->x.getWaterProof()==true&&x.getColor()=="Black").forEach(y->System.out.println(y));
//		List<Boolean>icc=bags.stream().map(x->x.getWaterProof()==true&&x.getColor()=="Black").collect(Collectors.toList());
//		 
//		 for(Boolean y : icc) {
//			 System.out.println(y);
//		 }
		 
		// bags.stream().filter(x->x.getBrand().endsWith("Bag")).forEach(y->System.out.println(y.getBrand()+","+y.getPrice()+","+y.getZips()));
		
		// bags.stream().filter(x->x.getWaterProof()==true&&x.getPrice()<2500).forEach(y->System.out.println(y.getBrand()));
		 
//		 int max=0;
//		 String a=" ";
//		// bags.stream().filter(x->x.getPrice()>1000).collect(Collectors.toList());
//		 List<Bag>icc=bags.stream().filter(x->x.getPrice()>1000).collect(Collectors.toList());
//		for(Bag x :icc) {
//			if(x.getPrice()>max) {
//				max=x.getPrice();
//				a=x.getBrand();
//			}
//		}
//		 System.out.println(a);
		 
//		bags.stream().filter(o->o.getZips()<5&&o.getColor().contains("B")).map(x->x.getBrand()).forEach(z->System.out.println(z));
//		
//		List<String>icc=bags.stream().filter(o->o.getZips()<5&&o.getColor().contains("B")).map(x->x.getBrand()).collect(Collectors.toList());
//		 for(String x :icc) {
//			 if(x.contains("a")||x.contains("e")||x.contains("i")||x.contains("o")||x.contains("u")) {
//				 System.out.println(x+"has Vols");
//				
		List<Bag>icc=bags.stream().filter(x->!x.getColor().equalsIgnoreCase("")).collect(Collectors.toList());		 
			icc. forEach(y->System.out.println(y));
			 
			 }
		 }
	

