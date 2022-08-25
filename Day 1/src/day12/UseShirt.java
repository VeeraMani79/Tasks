package day12;

public class UseShirt {
   public static void main(String[] args) {
	   
	   Shirt s2=new Shirt ();
	   s2.ShirtPrice=1500;
	   s2.brand="Zudio";
	   s2.isChecked=false;
	   
	   Shirt s1=new Shirt ();
	   s1.ShirtPrice=1200;
	   s1.brand="otto";
	   s1.isChecked=true;
	   
	   Shirt s3=new Shirt ();
	   s3.ShirtPrice=2000;
	   s3.brand="addidas";
	   s3.isChecked=false;
	   
	   Shirt [] shirts= {s1,s2,s3};
	   
	  int max=0;
	  for(int i=0;i<shirts.length;i++) {
		  if(shirts[i].ShirtPrice>max) {
			  max=shirts[i].ShirtPrice;
			  
		  }
	  }
	   
	   
	  System.out.print(max); 
	   
   }
}
