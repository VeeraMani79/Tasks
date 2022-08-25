package day10;

public class UseBike {
   public static void main(String[] args) {
	   
	   Bike b1=new Bike ();
	   b1.color="Black";
	   b1.brand="Suziki";
	   b1.price=75000;
	   
	   Bike b2=new Bike ();
	   b2.color="White";
	   b2.brand="Hero honda";
	   b2.price=65000;
	  
	   Bike b3=new Bike ();
	   b3.color="Red";
	   b3.brand="Rs 200";
	   b3.price=150000;
	   
	   Bike b4=new Bike ();
	   b4.color="Darkgray";
	   b4.brand="Passion bro";
	   b4.price=85000;
	   
	   Bike b5=new Bike ();
	   b5.color="Green";
	   b5.brand="Nijas";
	   b5.price=2000000;
	   
	   Bike b6=new Bike ();
	   b6.color="Blue";
	   b6.brand="cd-100";
	   b6.price=90000;
	  
	   Bike b7=new Bike ();
	   b7.color="Voilet";
	   b7.brand="Platina";
	   b7.price=70000;
	  
	   Bike b8=new Bike ();
	   b8.color="Blackand white";
	   b8.brand="Pulser";
	   b8.price=100000;
	   
	   Bike b9=new Bike ();
	   b9.color="Dark blue";
	   b9.brand="Activa";
	   b9.price=60000;
	   
	   Bike b10=new Bike ();
	   b10.color="Orange";
	   b10.brand="Duke";
	   b10.price=180000;
	
	   
	   Bike [] b= {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
	   int add=0;
	   int add1=0;
		int add2=0;	
		int count=0;
		int average=0;
	   for(int i=0;i<b.length;i++) {
		   add=add+b[i].price;
	   }
	   System.out.println("total price = "+add);
   
	   System.out.println(" ");
	   for(int i=0;i<b.length/2;i++) {
		  add1=add1+b[i].price; 
	   }
	  System.out.println("fisrt half price = "+add1);
	  
	  System.out.println(" ");
	  for(int i=b.length/2;i>b.length;i++) {
		  add2=add2+b[i].price;
	  }
	  
	  System.out.println("second half price = "+add2);
	  
  
	   
	  for(int i=0;i<b.length;i++) {
		   count=count+1;
		  
	  }
	   
	   System.out.println("over all count"+count);
	   System.out.println(add/count);
    	
    
   for(int i=0;i<b.length;i++) {
	   
   
    System.out.println(b[i].price-1000);
    System.out.println(b[i].price+1000);	
   }

   }
}


