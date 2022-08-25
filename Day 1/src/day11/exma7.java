package day11;

public class exma7 {
   public static void main(String[] args) {
	   String a="malayalam";
	   String b=" ";
	   for(int i=a.length()-1;i>=0;i--) {
		   b=b+a.charAt(i);
	   }   
	 if(a.equals(b)) {
		 System.out.println("is polindrom" );
	 }
	 else {
		 System.out.println("is not polindrom" );
	 }
   
   } 
}
