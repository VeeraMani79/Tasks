package Exception_examples;

public class Example4 {

	public static void main(String [] args ) {
		
		int [] a= {1,2,3,4};
		try {
		 System.out.println(a[5]);
	}catch (ArrayIndexOutOfBoundsException c) {
		System.out.println(c); //        				ArrayIndexOutOfBoundsException
		System.out.println("Dont ussing Array");
	}
		System.out.println("Hello");
}
}
