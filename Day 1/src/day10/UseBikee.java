package day10;

public class UseBikee {
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
		   for(int i=0;i<b.length;i++) {
			   System.out.println(b[i].brand.toUpperCase());
			   
		   }
		   System.out.println(" ");
		   for(int i=0;i<b.length;i++) {
			   System.out.println(b[i].brand.toLowerCase()); 
			   
		   }
		   System.out.println(" ");
		   for(int i=0;i<b.length;i++) {
			   System.out.println(b[i].brand.equals("Duke"));
			   
		   }
		   System.out.println(" ");
		   for(int i=0;i<b.length;i++) {
			   System.out.println(b[i].brand.length());
		   }
	
		 System.out.println(" ");   
		 for(int i=0;i<b.length;i++ ) {
			 System.out.println(b[i].brand.charAt(b[i].brand.length()-1));
		 }
	     System.out.println(" ");
	     for(int i=0;i<b.length;i++) {
	    	 System.out.println(b[i].brand.charAt(0));
	     }
         System.out.println(" ");
         for(int i=0;i<b.length;i++) {
        	 System.out.println(b[i].brand.startsWith("h"));
         }
         System.out.println(" ");
         for(int i=0;i<b.length;i++) {
        	 System.out.println(b[i].brand.endsWith("n"));
         }
         System.out.println(" ");
         for(int i=0;i<b.length;i++) {
        	 System.out.println(b[i].brand.charAt(b[i].brand.length()-2));
         }
         System.out.println(" ");
         for(int i=0;i<b.length;i++) {
        	 System.out.println(b[i].brand+"length is"+b[i].brand.length());
        	 
         }
        
         
	 }  	 
        	 
        	 
         }