package Exception_examples;

public class Example3 {

	public static void main(String [] args) {
		String a="hai";
		try {
			int b=Integer.parseInt(a);	
		}catch(NumberFormatException c) { //using NumberFormatException
		System.out.println("Dont Using string Number format ");
		System.out.println(c);
	}
		System.out.println("hello");
	}
}
