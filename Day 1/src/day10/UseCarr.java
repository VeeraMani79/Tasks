package day10;

public class UseCarr {
	public static void main(String[] args) {
		  Carr c1=new Carr ();
		  c1.brand="Audi";
		  c1.price=2000000;
		  c1.rating=4.5f;
		  
		  Carr c2=new Carr ();
		  c2.brand="BMW";
		  c2.price=25000000;
		  c2.rating=4.9f;
		  
		  Carr c3=new Carr ();
		  c3.brand="Nano";
		  c3.price=100000;
		  c3.rating=3.2f;
		  
		  Carr c4=new Carr ();
		  c4.brand="Inova";
		  c4.price=600000;
		  c4.rating=4.2f;
		  
		  Carr c5=new Carr ();
		  c5.brand="Nissan";
		  c5.price=3000000;
		  c5.rating=4.8f;
		  
		  Carr c6=new Carr ();
		  c6.brand="Honda";
		  c6.price=2500000;
		  c6.rating=3.9f;
		  
		  Carr c7=new Carr ();
		  c7.brand="Rolls rayals";
		  c7.price=35000000;
		  c7.rating=4.9f;
		    
		  Carr c8=new Carr ();
		  c8.brand="Swift";
		  c8.price=4500000;
		  c8.rating=4.7f;
		  
		  Carr [] c= {c1,c2,c3,c4,c5,c6,c7,c8};
		  
		  for(int i=c.length-1;i>=0;i--) {
			  System.out.println("brand= "+c[i].brand);		  
		  }
		  System.out.println(" ");
		 
		  for(int i=c.length-1;i>=0;i--) {
			  System.out.println("price= "+c[i].price);		  
		  }
		  System.out.println(" ");
		  for(int i=c.length-1;i>=0;i--) {
			  System.out.println("rating= "+c[i].rating);		  
		  }
		  System.out.println(" ");
		  for(int i=c.length/2-1;i>=0;i--) {
			  System.out.println("brand= "+c[i].brand);		  
		  }
		  System.out.println(" ");
		  for(int i=c.length/2-1;i>=c.length;i--) {
			  System.out.println("price= "+c[i].price);		  
		  }
		  System.out.println(" ");
		  for(int i=c.length/2-1;i>=0;i--) {
			  System.out.println("rating= "+c[i].rating);		  
		  }
		
		  System.out.println(" ");
		  for(int i=c.length-1;i>=0;i--) {
			  System.out.println("Brand = "+c[i].brand+","+" Price = "+c[i].price+","+" rating = "+c[i].rating);
			  
			  
		  }
		  
		  
	}		  
		  
}
