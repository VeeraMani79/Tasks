package Exception_examples;

public class Example5 {

	public static void main(String [] args) {
		String b="OneSoft";
		try {
		System.out.println(b.charAt(8));
	}catch(StringIndexOutOfBoundsException c) {   		//StringIndexOutOfBoundsException
		System.out.println(c);
		
	}
		System.out.println("Hello");
	}
}
