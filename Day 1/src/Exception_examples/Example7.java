package Exception_examples;

public class Example7 {

	public static void main(String [] args) {
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
			
		}catch(ArithmeticException c) {
			System.out.println(c);
			System.out.println("is not found");
		}
		
		
		finally {
			System.out.println("Hi"); // finally keyword
		}
		System.out.println("hello");
	}
}
