package day12;

public class UseBike {
 public static void main(String[] args) {
	 
	 Bike b1=new Bike();
	 b1.speed=250;
	 b1.model="Honda";
	 b1.registerNumber="TN 91 CE4262";
	 b1.isAlloyWheel=true;
	 
	 Bike b2=new Bike();
	 b2.speed=200;
	 b2.model="platina";
	 b2.registerNumber="KL 26 Y2605";
	 b2.isAlloyWheel=false;
	 
	 Bike b3=new Bike();
	 b3.speed=200;
	 b3.model="Rx-100";
	 b3.registerNumber="KA 25 E1999";
	 b3.isAlloyWheel=true;
	 
	 
	 Bike [] bikes= {b1,b2,b3};
	 
	 for(int i=0;i<bikes.length;i++) {
		 if(bikes[i].registerNumber.startsWith("TN")) {
			 System.out.println(bikes[i].speed+","+bikes[i].model.toUpperCase()+","+bikes[i].registerNumber+","+bikes[i].isAlloyWheel);
		 }
	 }	 
	 
 }
}
