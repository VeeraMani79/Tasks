package day7;

public class SwithUseString {
 public static void main(String[] args) {
	 String food="Idly";
	 switch (food) {
	 case "Idly":
		 int gst1=10;
		 System.out.println("rs"+(40+gst1));
			 break;
	 case "dosa":
				 int gst2=15;
	    System.out.println("rs"+(5+gst2));
	        break;
	 case "poori":
		 int gst3=12;
System.out.println("rs"+(50+gst3));
    break;	
	        
	 case "pongal":
		 int gst4=8;
System.out.println("rs"+(39+gst4));
    break;    
	  default:
		  
	       System.out.println("enter valid input");
	       break;
	        
	 }  
		 }
	 }
	



