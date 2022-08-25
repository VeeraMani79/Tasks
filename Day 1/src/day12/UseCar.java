package day12;

public class UseCar {

public static void main(String[] args) {
	Car c1=new Car ();
	c1.model="BMW";
	c1.color="black";
	c1.price=5000000;
	c1.taxAmount=500;
	c1.registerNumber="TN 34 7687";
	c1.isElectric=true;
	
	Car c2=new Car ();
	c2.model="Audi";
	c2.color="red";
	c2.price=7000000;
	c2.taxAmount=500;
	c2.registerNumber="TN 34 6887";
	c2.isElectric=true;
	
	Car c3=new Car ();
	c3.model="RR";
	c3.color="blue";
	c3.price=6000000;
	c3.taxAmount=500;
	c3.registerNumber="TN 34 7887";
	c3.isElectric=true;
	
	Car [] cars= {c1,c2,c3};
	int max=0;
	String color1=" ";
	String model1=" ";
	int price1=0;
	String registerNumber1=" ";
	for(int i=0;i<cars.length;i++) {
		if(cars[i].color.length()>max) {
			max=cars[i].color.length();
			model1=cars[i].model;
			color1=cars[i].color;
			price1=cars[i].price;
			registerNumber1=cars[i].registerNumber;
			
		}
	}
	System.out.println(color1+" "+model1+" "+(price1+price1*(500/100))+" "+registerNumber1);
	
}
} 
