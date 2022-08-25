package Exception_examples;

public class Age {

	public static void main(String [] args) {
	
		int age=16;
		try {							// using throw key word and getMessage()
		if(age>=18) {
			System.out.println("Eligible for Vote");
		}
		else {
			throw new ArithmeticException("Not Eligible for Vote");
		}
	}catch(ArithmeticException e) {
		//System.out.println(e.getMessage());
		System.out.println("Not Eligible for Vote");
	}
}
}
