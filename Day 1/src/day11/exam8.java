package day11;

public class exam8 {
 public static void main(String[] args) {
	 int  a=7;
    String flag="true";
	 for(int i=2;i<a;i++) {
		
		 if(a%i==0) {
			 flag="false";
		 }
	 }
	if(flag.equals("true")) {
		System.out.println(a+"is a prime");
		
	 }
	else {
		System.out.println(a+"is a not prime");
	}
 }
}
