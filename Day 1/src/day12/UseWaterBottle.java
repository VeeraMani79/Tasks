package day12;

public class UseWaterBottle {
 public static void main(String[] args) {
	 
	 WaterBottle w1=new WaterBottle ();
	 w1.volume=4.55f;
     w1.bottleType="plastic";
     w1.isReusable=true;
     w1.price=80;
     
     WaterBottle w2=new WaterBottle ();
	 w2.volume=5.55f;
     w2.bottleType="steel";
     w2.isReusable=true;
     w2.price=90;
     
     WaterBottle w3=new WaterBottle ();
	 w3.volume=4.55f;
     w3.bottleType="glass";
     w3.isReusable=true;
     w3.price=100;
     
     WaterBottle [] waterBottles= {w1,w2,w3};
     for(WaterBottle x : waterBottles) {
    	 if(x.bottleType.equalsIgnoreCase("glass")) {
    		 System.out.println(x.bottleType+","+x.volume+","+x.price+","+x.isReusable);
    	 }
     }
     
     
	 
	 
 }
} 
