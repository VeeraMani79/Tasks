package Exception_examples;

public class Example2 {
 public static void main(String [] args) {
	 System.out.println("Hello");
	String a=null;
	try {
		System.out.println(a.length());   //Null point EXCEPTION
	}catch (NullPointerException e) {
	System.out.println(e);
	
 }
	System.out.println("hai");
}
}

