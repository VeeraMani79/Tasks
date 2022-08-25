package Exception_examples;

public class Vote {
	public static void main(String [] args) throws AgeException {
		int age=17;
		try {
			if(age>=18) {
				System.out.println("Eligible");
			}
			else {
				throw new AgeException("Not Eligible");// using throws
				
			}
			
		}catch(AgeException d) {
			System.out.println(d.getMessage());
		}
	}

}
