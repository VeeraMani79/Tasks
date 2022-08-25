package day10;

public class UseCar {
  public static void main(String[] args) {
	  Car c1=new Car ();
	  c1.brand="Audi";
	  c1.price=2000000;
	  c1.rating=4.5f;
	  c1.taxAmount=8;
	  
	  Car c2=new Car ();
	  c2.brand="BMW";
	  c2.price=25000000;
	  c2.rating=4.9f;
	  c2.taxAmount=11;
	  
	  Car c3=new Car ();
	  c3.brand="Nano";
	  c3.price=100000;
	  c3.rating=3.2f;
	  c3.taxAmount=12;
	  
	  Car c4=new Car ();
	  c4.brand="Inova";
	  c4.price=600000;
	  c4.rating=4.2f;
	  c4.taxAmount=15;
//	  
//	  Car c5=new Car ();
//	  c5.brand="Nissan";
//	  c5.price=3000000;
//	  c5.rating=4.8f;
//	  
//	  Car c6=new Car ();
//	  c6.brand="Honda";
//	  c6.price=2500000;
//	  c6.rating=3.9f;
//	  
//	  Car c7=new Car ();
//	  c7.brand="Rolls rayals";
//	  c7.price=35000000;
//	  c7.rating=4.9f;
//	    
//	  Car c8=new Car ();
//	  c8.brand="Swift";
//	  c8.price=4500000;
//	  c8.rating=4.7f;
//	  
//	  
	  Car [] c=new Car[4];
	  c[0]=c1;
	  c[1]=c2;
	  c[2]=c3;
	  c[3]=c4;		 
//    c[4]=c5;
//	  c[5]=c6;
//	  c[6]=c7;
//	  c[7]=c8;
	  
//	  for(int i=0;i<c.length;i++) {
//		  
//		  System.out.println("Brand = "+c[i].brand);
//		  
//		  
//	  }
//			  
//	 System.out.println("  ");
//	 
//	for(int i=0;i<c.length;i++) {
//	
//		 System.out.println("price = "+c[i].price);
//		 
//	}
//	 
//	 System.out.println("  ");
//	 
//	 for(int i=0;i<c.length;i++) {
//			
//		 System.out.println("rating = "+c[i].rating);
//		 
//	}
//	 
//	 System.out.println("  "); 
//	 for(int i=0;i<c.length/2;i++) {
//		 System.out.println("Brand=" +c[i].brand);
//		 
//	 }
//	  System.out.println(" ");
//	  for(int i=c.length/2;i>c.length;i++) {
//			 System.out.println("Brand=" +c[i].brand);
//			 
//		 }
//		  System.out.println(" ");
//		  for(int i=0;i<c.length/2;i++) {
//				 System.out.println("Price= "+c[i].price);
//				 
//			 }
//			  System.out.println(" ");
//			  for(int i=c.length/2;i>c.length;i++) {
//					 System.out.println("Price= "+c[i].price);
//					 
//				 }
//				  System.out.println(" ");
//				  for(int i=0;i<c.length/2;i++) {
//						 System.out.println("rating= "+c[i].rating);
//						 
//					 }
//					  System.out.println(" ");
//					  for(int i=c.length/2;i>c.length;i++) {
//							 System.out.println("rating= "+c[i].rating); 
//	  
//					  }
//					  System.out.println(" ");
//					  for(int i=0;i<c.length;i++) {
//						  System.out.println("Brand = "+c[i].brand+","+" Price = "+c[i].price+","+" rating = "+c[i].rating);
//						  
//					  }	
					 int add=0;
					 int count = 0;
					 int average=0;
				 for(int i=0;i<c.length;i++) {
			     System.out.println(c[i].price+c[i].price*c[i].taxAmount/100);   
				 }
				 for(int i=0;i<c.length;i++) {
					 add=add+c[i].price;
					 count=count+1;
					 average=add/c.length;
				 }
				 System.out.println(average);
			
  }
}
